import java.util.ArrayList;
import java.util.Scanner;

public class AAAAASortingArray {
    public static void sort(ArrayList<Integer> arr) {
        if(arr.size() == 1){
             return;
        }
        int temp = arr.get(arr.size()-1);
        arr.remove(temp);
        sort(arr);
        SortedInsert(arr, temp);
        return;

    }

    public static void SortedInsert(ArrayList<Integer> arr, int ele) {
        if(arr.size() == 0 || arr.get(arr.size()-1)<= ele){
            arr.add(ele);
            return;
        }
        int val = arr.get(arr.size() -1);
        arr.remove(val);
        SortedInsert(arr, ele);
        arr.add(val);
        return;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0 ;i<N ;i++){
            int A = sc.nextInt();
            ans.add(A);
        }
        sort(ans);
    }
}
