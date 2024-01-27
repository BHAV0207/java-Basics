//smallest index such that arr[ind] > n;
public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,6,7,8,9};
        int N = 6;
        UPperBound(arr, N);

    }

    public static void UPperBound(int[]A ,int B) {
        int start = 0;
        int end = A.length-1;
        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(A[mid]>B){
                ans =mid;
                end  = mid-1;

            }
            else{
                start =  mid +1;
            }
        }

        System.out.println(ans);

    }
}
