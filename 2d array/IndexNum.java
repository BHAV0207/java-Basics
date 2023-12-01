import java.util.Scanner;

public class IndexNum{
    public static int[] IndexNumber(int[][]AA , int B){
         int[] coordinates = new int[2];
         coordinates[0] =  -1;
         coordinates[1] = -1;
         for(int i = 0 ; i<AA.length ; i++){
            for(int j = 0 ; j<AA[0].length ; j++){
                if(AA[i][j]==B){
                    coordinates[0] = i;
                    coordinates[1] = j;
                    return coordinates;
                }
               
            }
        }
        return coordinates;

    }
        

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        int[][] bhav = new int[ArraySize][ArraySize];
        int CC = sc.nextInt();
        for(int i =0 ;i<ArraySize ;i++){
            for(int j= 0 ; j<ArraySize ; j++){
                bhav[i][j] = sc.nextInt();
            }
        }
        int[] ans = IndexNumber(bhav ,CC);

        for(int i = 0; i < 2; i++){

            System.out.print(ans[i]+" ");
        }
        System.out.println("");
        //sc.close();
    }
}
