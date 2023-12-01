import java.util.*;
public class heighestandlowestindex{
    public static void IndexNumber(int [] B , int target){
     for(int i = 0; i<B.length ; i++){
        if(B[i]==target){
            System.out.println("first occurence" +" " + i);
            break;
        }
     }
     for(int i =B.length ; i>=0 ; i-- ){
        if(B[i]==target){
            System.out.println("last occurence" + " " +i);
                break;
        }
     }

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int[] A  = new int[a];
        for(int i = 0 ; i<a ;i++){
            A[i] = sc.nextInt();          
        }
        int target = sc.nextInt();
        IndexNumber(A , target);
    }
}