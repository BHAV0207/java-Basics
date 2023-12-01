import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TwoArraySort {
    public static int[] Total(int[]AA ,int[]BB) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0 ;i<AA.length ;i++){
            ans.add(AA[i]);
        }
        for(int i =0 ;i<BB.length ;i++){
            ans.add(BB[i]);
        }
        // Collection.sort(ans);
        int C[] = new int[ans.size()];

        for(int i =0 ;i<ans.size() ;i++){
            C[i]= ans.get(i);
        }
        Arrays.sort(C);
        return C;

    }
    public static void main(String[] args) {
        int ArrayA[] = {21,2,3,4,-11};
        int ArrayB[] = {11,33,1,-6,-10};
        System.out.print(Total(ArrayA ,ArrayB)); 
    }
}
