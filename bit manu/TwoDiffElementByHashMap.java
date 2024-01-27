import java.util.ArrayList;
import java.util.HashMap;

public class TwoDiffElementByHashMap {
        public static void main(String [] args){
           int [] ans = {1,1,2,2,3,3,4,5,6,6};
           ArrayList<Integer> a = TwoEle(ans);
           for(int i : a){
            System.out.println(i);
           }
        }

        public static ArrayList<Integer> TwoEle(int[]A) {
             HashMap<Integer, Integer> ans = new HashMap<>();
            for(int i =0 ;i<A.length ;i++){
                if(ans.containsKey(A[i])){
                    int freq =ans.get(A[i]);
                    ans.put(A[i], freq+1);
                }
                else{
                    ans.put(A[i] ,1);
                }
            }

            ArrayList<Integer> ans2 = new ArrayList<>();

            for(int i : ans.keySet()){

                if(ans.get(i)==1){
                    ans2.add(i);
                }
            }
            return ans2;
        }
    
}
