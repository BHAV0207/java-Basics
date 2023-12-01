import java.util.ArrayList;
import java.util.Scanner;

public class LeaderElement{

      public int[] LeaderEle(int[] A) {
        ArrayList<Integer> bhav =  new ArrayList<>();
       int [] B = new int[bhav.size()];

        int max =A[A.length-1];
        int count =1;
        for(int i =A.length-2 ; i>=0 ; i++){
            if(max<A[i]){
                max = A[i];
                count++;
            }
            bhav.add(A[i]);
         B[i] =bhav.get(i);
        }
return B;
    
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int AA =sc.nextInt();
        int  N[] =new int[AA];
        for(int i =0 ;i<AA ;i++)
        {
            N[i] =sc.nextInt();
        }
        LeaderEle(N);
    }
}