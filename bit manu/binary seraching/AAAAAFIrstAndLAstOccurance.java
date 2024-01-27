public class AAAAAFIrstAndLAstOccurance {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,5,5,8};
        int N = 7;

    }

    public static void LowerBound(int []A , int B) {
        int start =0;
        int end = A.length-1;
        int ans  =-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(A[mid]>=B){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
    } 

    public static void UpperBound(int A[] , int B) {
        int start =0;
        int end = A.length-1;
        int ans  =-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(A[mid]>B){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
    }

    //

    public static int Occurnace(int A[] , int B) {

        int Lb = LowerBound(A, B);
    }
}
