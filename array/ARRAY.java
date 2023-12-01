import java.util.*;
public class ARRAY{

     public static void marks(int[] BB){
            for(int i = 0 ; i<BB.length ; i++){
                System.out.print(BB[i] + " ");
            }
    }





    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] AA = new int[10];
        for(int i = 0 ; i<10 ; i++){
            AA[i] = sc.nextInt();
        }
            marks(AA);
    }
}