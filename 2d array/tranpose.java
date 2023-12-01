//not done by myself took help from sir 


import java.util.Scanner;

public class tranpose{
    public static void transpose(int[][] AA){
        for (int i = 0 ; i<AA.length ;i++){
            for(int j = 0; j<i;j++){
                int temp = AA[i][j];
                AA[i][j] = AA[j][i];
                AA[j][i] = temp;
            }
        }

    }
    public static void printMatrix(int[][]A){
        for (int i = 0;i<A.length;i++){
            for(int j = 0; j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        //Scanner sc = new Scanner(System.in);
        int[][] mat = {
            {2,3,4},
            {6,7,8},
            {7,6,9}
        };

        printMatrix(mat);
        System.out.println();
        transpose(mat);
        printMatrix(mat);
    }
}