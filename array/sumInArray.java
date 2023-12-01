import java.util.*;

public class sumInArray{

    public static void lavda(int[] aa){
        int sum = 0 ; 
        for(int i = 0 ; i<aa.length ; i++ ){
            sum += aa[i];
            
        }
        System.out.print(sum + " ");
    }




    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] bhav = new int[10];
        for(int i = 0 ; i<10 ; i++){
         
            bhav[i] = sc.nextInt();
        }
            lavda(bhav);
    }
}