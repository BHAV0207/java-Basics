import java.util.Scanner;

public class GreaterElement{
    public static int GreatElement(int[] B){
       int answer  = 0;
        for(int i = 0 ; i<B.length ; i++){
             for(int j= 0 ;j<B.length ; j++){
                if(B[i]<B[j]){
                    answer++;
                    break;
                }
             }
           
        }
        return answer;
       
    }





    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int ElementNumber = sc.nextInt();
        int[] A = new int[ElementNumber];
        for(int  i =0 ;i<ElementNumber ; i++){
            A[i] = sc.nextInt();        
        }
        GreatElement(A);

    }
}