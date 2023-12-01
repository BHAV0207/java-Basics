import java.util.Scanner;

public class QuerrySum {
    public static void main(int[][] BB , int[]C) {
        for(int i= 0 ;i<BB.length ;i++)
        {
            int Left = BB[i][0];
            int right = BB[i][1];

            int sum = 0;
            for(int j= Left ;j<right ; j++)
            {
                sum = sum + C[j];
            }
            System.out.print(sum);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int ArrayElement [] = {2 , 3 , 4 , 5, 6, 7, 8 , 8 , 9 , 0};
        
        int[][] Querries = {{1, 5} , { 3,4 } , {5,5} , {4,6}};

        

    }
}
