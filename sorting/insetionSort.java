import java.util.ArrayList;

public class insetionSort {
    public static int[] bhav(int[]A) {
        for(int i =1 ;i<A.length ;i++){
            int element = A[i];
            int j = i-1;
            while(j>=0 && A[j]>element){
                A[j+1]=A[j];
                j--;

            }
            A[j+i] = element;
        }
        return A;
        // for(int i =1 ;i<A.length ;i++){
        //     for(int j =0 ;j<=i ;i++){
        //         if(A[j+1]<A[j]){
        //             int temp  = A[j];
        //             A[j]= A[j+1];
        //             A[j+1] = temp;
        //         }
        //     }
            
        // }
    }
    public static void main(String[] args) {
        int Array[] = {7,5,10,2,-1,3};
        System.out.print(bhav(Array));    
    }
}
