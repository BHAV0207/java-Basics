public class RotatedSoretdCommonArray {
    public static void main(String[] args) {
         int ans[] ={7,8,9,1,2,3,3,3,4,5};
         int A= 1 ;
         System.out.println(CoomonSorted(ans, A));

    }
    public static int CoomonSorted(int[]A , int B) {
        int start =0;
        int end  = A.length-1; 

        while(start<=end){
            int mid = start+ (end-start)/2;

            if(A[mid]==B){
                return mid;
            }

            //this is the only difference between this and rotated aorted array
            if(A[start]==A[mid] && A[mid]==A[end]){
                start = start+1;
                end = end-1;
                continue;
            }

            if(A[start]<=A[mid]){
                if(A[start]<=B && A[mid]>=B){
                    end = mid-1;
                }
                else{
                    start = mid  +1;
                }
            }
            else{
                if(A[mid]<=B && A[end]>=B){
                    start = mid+1;
                }
                else{
                    end  =mid-1;
                }

            }
        }
        return -1;
    }
}
 