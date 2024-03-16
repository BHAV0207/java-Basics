import java.util.*; 
public class PriorityQKSorted {

    public static ArrayList<Integer> Sorted(int Arr[] ,int k) {
        //int SortedARR[] = new int[Arr.length];
        ArrayList<Integer> SortedARR = new ArrayList<>();
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i =0 ; i<k ;i++){
            ans.add(Arr[i]);
        }

        for(int i =k ;i<Arr.length ;i++){
            int curr = ans.peek();
            if(Arr[i]<curr){
                SortedARR.add(Arr[i]);
            }
            else{
                SortedARR.add(curr);
                ans.remove(curr);
                ans.add(Arr[i]);
            }
        }


        while(!ans.isEmpty()){
            SortedARR.add(ans.remove());
        }


        return SortedARR;
    }
    public static void main(String[] args) {
        int ans[] = {2,3,1,4,6,7,5,8,9};
        int AA[] = {4,5,2,1,3,6,9,8,7};
        // for(int i =0 ;i<ans.length ;i++){
        // }
        
        System.out.println(Sorted(AA, 3));
    }
}

