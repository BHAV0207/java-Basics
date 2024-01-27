//Use binar search whenever need ans like minimum or maximum


public class AAAAAKokoEatingBanana {
    public static void main(String[] args) {
        int A [] = {1,2,3,6,7,11};
        int H = 8;
        System.out.println(EatingTime(A, H));
        Max(A);
    }

    public static int Max(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<A.length ;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }

    // public static int TotalTime(int A[], int B) {
    //     int totalhour  =  0;
    //     for(int i = 0 ;i<A.length ;i++){
    //         totalhour += Math.ceil(A[i]/B);
    //     }
    //     return totalhour;
    // }

    public static int TotalTime(int A[], int B) {
        int totalhour = 0;
        for (int i = 0; i < A.length; i++) {
            totalhour += (A[i] + B - 1) / B; // Round up the division result
        }
        return totalhour;
    }
    

    public static int EatingTime(int A[] , int B) {
        int start =1;
        int end  =  Max(A);
        int ans = Integer.MAX_VALUE;

        while(start <=end){
            int mid  =  start + (end-start)/2;
            int totalans = TotalTime(A, mid);
            // if(totalans == B){
            //     ans = mid;
            //     return ans;
            // }
            if(totalans<=B){
                ans = mid;
                end = mid-1;
            }
            if(totalans > B){
                start  = mid +1;
            }

        }
        return ans;
    }
}
