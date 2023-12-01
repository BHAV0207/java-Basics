import java.lang.reflect.Array;
import java.util.Arrays;

public class NobleElementsOptimised{


    public static int Noble(int[] AA ) {
        Arrays.sort(AA);
        int count  =0 ;
        for(int i =0 ;i<AA.length ;i++){
            if(AA[i]==i){
                count++;
            }

        }
        return count;
    }
    public static void main(String [] args){
        int array[] = {-1,-5,3,5,-10,4};
        System.out.println(Noble(array));
    }
}
