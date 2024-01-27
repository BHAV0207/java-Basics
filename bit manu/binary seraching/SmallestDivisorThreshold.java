public class SmallestDivisorThreshold {
    public static void main(String[] args) {
        int A [] = {1,2,9,5};
        int B  =  6;

       System.out.println(Final(A, B)); 
        Max(A);
    }

    public static int Max(int A[]) {
        int max  =  Integer.MIN_VALUE;
        for(int  i=0 ; i < A.length ;i++){
            if(max<A[i]){
                max  = A[i];
            }
        }
        return max;
    }
    public static int ThresholdSum(int[] A , int B) {
        int sum =0;
        for(int  i =0 ; i<A.length ;i++){
            sum = sum + (A[i]+B-1)/B;
        }
        return sum ;
    }

    public static int Final(int A[] , int  B) {
        int start =1;
        int end  = Max(A);
        int ans =-1;

        while(start<=end){
            int mid  = start + (end-start)/2;
            int FinalAns = ThresholdSum(A, mid);
            if(FinalAns<=B){
                ans = FinalAns;
                end  = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }


}
