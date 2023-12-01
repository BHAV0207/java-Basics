import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllSubArray {

    public static int  PSUM(ArrayList<Integer> A) {

    ArrayList<Integer> bhav = new ArrayList<>();

    for(int i =0 ;i<A.size() ;i++){
        for(int j =i ;j<A.size() ;j++ ){
            int sum =0 ;
            for(int k =i ;k<=j ;k++){
                sum =sum+A.get(k);
            }
            bhav.add(sum);
        }    
    } 

    int Allsum =0;
    for(int i =0 ;i<bhav.size() ;i++){
        Allsum += bhav.get(i);
    }

    return Allsum;
    //   int Psum =0;
    //   bhav.add(0);
    //   for(int i =0 ;i<A.size();i++){
    //     Psum = Psum + A.get(i);
    //     bhav.add(Psum);
    //   }
    //   int sum=0;
    //   for(int i =0 ;i<bhav.size() ;i++){
    //     sum = sum + bhav.get(i);
    //   }
    //   return sum;
    }



    public static void main(String[] args) {
       ArrayList<Integer> Array = new ArrayList<>();
       int Arra [] = {1,2,3};
       for(int i =0 ;i<3 ;i++){
            Array.add(Arra[i]);
       }
       
            System.out.println(PSUM(Array));
    }
}
