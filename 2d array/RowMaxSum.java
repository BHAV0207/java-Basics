import java.util.Scanner;

public class RowMaxSum {
    public static void MaxSum(int[][] BB){
        int D =0 ;
            for(int i=0;i<BB.length;i++){
                int sum = 0 ;
                for(int j = 0 ; j<BB[0].length; j++){
                        sum =sum+BB[i][j];
                }
                    if(D<sum){
                     D = sum;
                            }
                //System.out.println(D);            
            }

            System.out.println(D);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int AA[][] =new int[3][3];
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                AA[i][j] = sc.nextInt();

            }

        }
        MaxSum(AA);
    }
}