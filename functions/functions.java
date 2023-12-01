import java.lang.*;
import java.util.*;

public class functions {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;  i<=a ; i++){
        //int count = 0;
        int Factors =0;
            for(int j =1 ;j<=i ;j++){
                if(i%j==0){
                 Factors++;
                }
            }
        if(Factors==2){
            System.out.println(i);
        }

            }
        }
    }