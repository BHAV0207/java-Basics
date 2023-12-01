import java.util.Scanner;

public class rotation{
public static void Rotation(int[]AA){
    Scanner sc =new Scanner(System.in);
    int C =sc.nextInt();
    for(int j = 1 ; j<=C ; j++){
        
    for(int i = 1 ; i<=AA.length ; i++){
        System.out.println(AA[i]);
    }
}
}




    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0 ;i<N ;i++){
            A[i] = sc.nextInt();
        }
        Rotation(A);
    }
}