import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort{


    public static int[] Bubble(int[] AA ) {
        for(int i =0 ;i<AA.length ;i++){
            for(int j =0 ;j<AA.length-1 ;j++ ){
                if(AA[j]>AA[j+1]){
                    int temp=AA[j];
                    AA[j] = AA[j+1];
                    AA[j+1] = temp;
                }
            }
        }
        return AA;
    }
    public static void main(String [] args){
        int array[] = {-1,-5,3,5,-10,4};
        int[] ans = Bubble(array);
        for(int i =0 ;i<array.length ;i++){
            System.out.print(ans[i] + " ");
        }
    }
}