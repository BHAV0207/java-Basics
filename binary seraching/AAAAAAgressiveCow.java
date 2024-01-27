import java.util.Arrays;

public class AAAAAAgressiveCow {
    public static void main(String[] args) {
        int A[] = {0,3,4,7,9,10};
        int Cows = 4;
        System.out.println(AressiveGai(A, Cows));
    }

    public static boolean CanCow(int A[] ,int B , int Cows) {
        int previousCow = A[0];
        int cowCount = 1;
        for(int i =1; i<A.length ;i++){
            if((A[i]-previousCow)>=B){
                cowCount++;
                previousCow = A[i]; 
            }
        }
        if(cowCount>= Cows){
            return true;
        }
        else{
            return false;  
        }


    }

    public static int AressiveGai(int A[] , int B) {
        Arrays.sort(A);
        int start =0;
        int end  = A[A.length-1]- A[0];
        int ans =-1;

        while(start<=end){
            int mid =  start + (end-start)/2;
            if(CanCow(A, mid, B)==true){
                 ans =  mid;
                 start  = mid +1;
            }
            else{
                end = mid-1;
            }

        }
        return ans;
    }
}
