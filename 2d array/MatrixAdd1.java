import java.util.Scanner;

public class MatrixAdd1{

public static void man(int[][] BB){
     for(int i = 0 ; i<BB.length ; i++){
            for(int j = 2 ; j>=0; j-- ){
                    System.out.print(BB[i][j]);
            }
}
System.out.println();
}

    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for(int i = 0 ; i<A.length ; i++){
            for(int j = 0 ; j <A.length ; j++ ){
                    A[i][j] = sc.nextInt();
            }
        }
        man(A);
    }
}
