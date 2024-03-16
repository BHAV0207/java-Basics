import java.util.ArrayList;
import java.util.Arrays;

public class Heapify {
    public static ArrayList<Integer> swap(ArrayList<Integer> ans , int i , int largest) {
        int temp = ans.get(i);
        ans.set(i, ans.get(largest));
        ans.set(largest, temp);

        return ans;
    }


    public static void Heapifyyy(ArrayList<Integer> ans  , int i) {
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;

        if(left<ans.size() && ans.get(left)>ans.get(largest)){
            largest = left;
        }
        if(right<ans.size() && ans.get(right)>ans.get(largest)){
            largest = right;
        }

        

        if(largest == i){
            return;
        }
        else{
            swap(ans , i ,largest);
            Heapifyyy(ans, largest);
        }
    }


    public static ArrayList<Integer> BuildHeap(ArrayList<Integer> ans , int n) {
        for(int i =(n-1)/2 ; i>=0 ;i--){
            Heapifyyy(ans , i);
        }
      
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(10,30,50,20,35 ,15));
        int n = ans.size();
        ArrayList<Integer> bhav = new ArrayList<>();
        bhav = BuildHeap(ans, n);

        for(int i =0;i<bhav.size() ;i++){
            System.out.println(bhav.get(i));
        }
        
    }
}