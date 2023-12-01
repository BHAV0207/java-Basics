import java.lang.*;
import java.util.*;

public class removingelement{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc =new Scanner(System.in);
        int a  = sc.nextInt();
        int[] A = new int[a] ;
        for(int i = 0; i<a ; i++){
            A[i] =sc.nextInt();
        }

        int b= sc.nextInt();
       // int c =sc.nextInt();

        int[]B = new int[a-1];
        for(int i = 0 ; i<a-1 ; i++){
            if(i<(b-1)){
                B[i] = A[i];
            }
            else if(i > (b-1)){
                B[i] = A[i+1];
            }
            System.out.print(B[i] + " ");
        }
        


  
    }
}