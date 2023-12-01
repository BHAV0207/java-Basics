
import java.util.Arrays;
public class KMIN {


    public static int KMin(int[]AA , int B) {
        Arrays.sort(AA);
        int ans  = 0;
        for(int i =0 ;i<AA.length ;i++){
            if((i+1)==B){
                ans = AA[i];
            }
        }
        return ans;
    }
    public static void main(String [] args){

        int k = 5;
        int array[] =  { 1 ,3 ,5,8,10,-9,6};
       System.out.println(KMin(array, k));

    }
}