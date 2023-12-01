import java.lang.*;
import java.util.*;

public class ShiftingOfArray{
  
      public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int Array[]  = new int [N];
        for(int i =0 ;i<Array.length ;i++){
            Array[i] = sc.nextInt();
        }

         int temp =Array[Array.length-1];


        for(int i = Array.length-1 ; i>0; i--){
           Array[i] = Array[i-1];
        }
        Array[0] = temp ;


        for(int i =0 ;i<Array.length ; i++){
            System.out.print(Array[i] + " ");
        }


    }


}


  
