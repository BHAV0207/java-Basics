public class UnniqueEle {
    public static void main(String[] args) {
        int A[] = {1,1,4,4,5,6,6 };
       System.out.println(Unique(A));
    }

    public static int Unique(int []A) {
        if(A.length == 1){
            return A[0];
        }
        if(A[0]!=A[1]){
        return A[1];
        }
        if(A[A.length-2]!=A[A.length-1]){
            return A[A.length-1];
        }

        int start =1;
        int end  = A.length-2;

        while(start<=end){
            int mid = start+(end-start)/2; 
            if(A[mid]!=A[mid+1] && A[mid]!=A[mid-1]){
                return A[mid];
            }
            if((mid%2!=0 && A[mid]==A[mid-1]) || (mid%2==0 && A[mid]==A[mid+1])){
                    start= mid+1;
            }
            else{
                end =mid -1;
            }
            
        }
        return -1; 
    }
}
