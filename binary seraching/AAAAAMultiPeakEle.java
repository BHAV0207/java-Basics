public class AAAAAMultiPeakEle {
    public static void main(String[] args) {
        int A[] = {1,3,5,6,8,11,9,10,4,2,0};
        System.out.println(Peak(A));
    }

    public static int Peak(int []A) {

        if(A[0]>A[1]){
            return A[0];
        }

        if(A[A.length-1]>A[A.length-2]){
            return A.length-1;
        }

        int start =1;
        int end = A.length-2;

        while (start<=end){
            int mid = start +(end-start)/2;
            if(A[mid]>A[mid+1] && A[mid]>A[mid-1]){
                return A[mid];
            }
            else if(A[mid]>A[mid-1]){
                start = mid+1;
            }
            else if(A[mid]>A[mid+1]){
                end =mid-1;
            }

            //only diffence from single peak element code 
            else{
                start = mid +1;
            }

        }
        return -1;
    }
}
