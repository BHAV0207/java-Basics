import java.util.HashMap;

import javax.print.DocFlavor.INPUT_STREAM;

public class AllThriceOneOnceByHashMap {
    public static void main(String[] args) {
        int [] ans = {1,1,1,2,2,2,3,3,3,4,4,4,6};
        System.out.println(OneOnce(ans));
    }

    public static int OneOnce(int A[]) {
        HashMap<Integer ,Integer> bhav = new HashMap<>();
        for(int i =0 ;i<A.length ;i++){
            if(bhav.containsKey(A[i])){
                int freq = bhav.get(A[i]);
                bhav.put(A[i], freq+1);
            }
            else{
                bhav.put(A[i], 1);
            }
        }

        for(int i : bhav.keySet()){
            if(bhav.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}
