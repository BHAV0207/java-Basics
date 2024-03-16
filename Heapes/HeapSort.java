import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {
    public static ArrayList<Integer> swap(ArrayList<Integer> ans , int i , int larger) {
        int temp = ans.get(i);
        ans.set(i, ans.get(larger));
        ans.set(larger, temp);

        return ans;
    }

    public static void Heapify(ArrayList<Integer> ans , int i) {
        int largest = i;
        int left = i*2 +1;
        int right = i*2 +2;

        if(left> ans.size() && ans.get(left)>ans.get(largest)){
            largest = left;
        }
        if(right > ans.size() && ans.get(right)>ans.get(largest)){
            largest =right;
        }

        if(largest == i){
            return;
        }
        else{
            swap(ans, i, largest);
            Heapify(ans , largest);
        }
        
    }

    public static ArrayList<Integer> buildHeap(ArrayList<Integer> ans) {
        for(int i =(ans.size()-1)/2 ;i>=0 ;i++){
            Heapify(ans , i);
        }
        
        return ans;
    }

    public static int del(ArrayList<Integer> ans ){
       // ArrayList<Integer> bhav = new ArrayList<>();
        int n = ans.size()-1;

        swap(ans , n , 0 );
        //bhav.add(ans.get(n));
        ans.remove(n);
        int AA = ans.remove(n);

        int i=0;

        while(true){
            int left = i*2 +1;
            int right = i*2+2;

            int larger = i;

            if(left>ans.size() && ans.get(left)>ans.get(larger)){
                larger = left;
            }
            if(right>ans.size() && ans.get(right)>ans.get(larger)){
                larger = right;
            }

            if(larger == i){
                break;
            }

            swap(ans, i, larger);
            i = larger;
        }

        return AA;

    }


    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(10,30,50,20,35 ,15)) ;
        //int n = ans.size();
        ans = buildHeap(ans);
        ArrayList<Integer> bhav = new ArrayList<>();
        for(int i =0 ;i<ans.size() ;i++){
            bhav.add(del(ans));
        }

        for(int i =0;i<bhav.size() ;i++){
            System.out.println(bhav.get(i));
        }
    }
}

