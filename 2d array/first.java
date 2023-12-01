import java.util.Scanner;

public class first{
    public static void matrix(int[][] BB ){
            int rows  = BB.length;
            int colums  = BB[0].length;
            for(int i = 0 ; i<rows ; i++){
                for(int j = 0 ; j<colums ; j++){
                    System.out.print(BB[i][j] + " ");
                }
                System.out.println();
            }
            
    } 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] AA = new int[4][4];
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                AA[i][j] =sc.nextInt();
            }
        }
        matrix(AA);
    }
}