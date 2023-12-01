import java.util.Scanner;

public class maxElementOfMatrix{
    public static void max(int[][] BB){
        int C =BB[0][0];
            for(int i = 0 ; i<BB.length ; i++){
                for(int j = 0 ; j<BB[0].length; j++){
                    if(C < BB[i][j]){
                        C = BB[i][j];
                }
            }
    }
    System.out.println(C);
}
    public static void main(String [] args){
        Scanner sc  =new Scanner(System.in);
        int[][] AA = new int[2][2];
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<2 ; j++){
                AA[i][j] = sc.nextInt();
            }
        }
        max(AA);
    }
}