public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
        int A = 1;
       System.out.println(RotatedSearching(arr, A)); 

    }

    public static int RotatedSearching(int A[] ,int B) {
        int start = 0;
        int end  =A.length-1;
       // int ans =-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(A[mid]==B){
                return mid;
            }

            if(A[start]<=A[mid]){
                if(A[start]<=B && A[mid]>=B){
                    end  = mid-1; 
                }
                else{
                    start =mid+1; 
                }
            }
            else{

                if(A[end]>=B && A[mid]<=B){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }

                
            }
        }

       return -1;
   
    }
}

