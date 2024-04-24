public class Fibonacci {
// recursive code 
    public static int FeboRecur(int A) {
        if(A <= 1){
            return A;
        }
        return FeboRecur(A-1) + FeboRecur(A-2);
    }


//memorised code
    public static int FeboMemorisedDP(int A  , int[] arr) {
        if(A<=1){
            return A;
        }
        if(arr[A] != -1){
            return arr[A];  
        }
        return arr[A] = FeboMemorisedDP(A-1, arr) + FeboMemorisedDP(A-2, arr);
    }


// tabulation code
public static int FeboTabularDP(int A , int arr[]) {
    arr[0] = 0;
    arr[1] = 1;

    for(int i =2 ;i<=A ;i++){
        arr[i]  = arr[i-1] + arr[i-2]; 
    }

    return arr[A];
}
    public static void main(String[] args) {
        int A = 10;
        int arr[] = new int[11];
        for(int i =0 ;i<11 ;i++){
            arr[i] =-1;
        }

        System.out.println(FeboTabularDP(A, arr)); 
    }
}
