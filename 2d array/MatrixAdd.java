import java.util.Scanner;

public class MatrixAdd{
    public static void Add(int[][]BB , int[][]DD){
      for(int i = 0 ; i<BB.length ; i++){
        for(int j = 0;j<BB[0].length ; j++){
            System.out.print(BB[i][j] + DD[i][j] + " ");
        }
        System.out.println();
      }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B  = sc.nextInt();
        int[][] AA = new int[A][B];
        int [][] CC = new int[A][B];
        for(int i = 0 ; i<A ; i++){
            for(int j = 0 ; j<B ; j++){
                AA[i][j] = sc.nextInt(); 
            }
        }
        for(int i = 0 ; i<A ; i++){
            for(int j =0 ; j<B ; j++){
                CC[i][j] = sc.nextInt();
            }
        }
        Add(AA , CC);

    }
}