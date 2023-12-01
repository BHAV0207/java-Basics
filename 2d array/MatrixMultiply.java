import java.util.Scanner;

public class MatrixMultiply{
    public static int Multiply(int[][]CC , int[][]DD ){
            
    }





    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int[][] AA  = new int[3][3];
        int[][] BB = new int [3][3];
        System.out.println("write the first matrix");
        for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                AA[i][j] = sc.nextInt();             
            }
        }       
        
        System.out.println("write the second matrix");
         for (int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                BB[i][j] = sc.nextInt();             
            }
        }    
        
        Multiply(AA , BB);
    }
}