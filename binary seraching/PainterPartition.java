import java.util.Arrays;

public class PainterPartition {
    public static void main(String[] args) {
        int A [] = {185,186,938,558,655,461,441,234,902,681};
        int K = 3;
        Max(A);
        sum(A);
        System.out.println(Painter(A, K));

    }

    public static int Max(int A[]) {
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i <A.length ;i++){
            if(max<A[i]){
                max =  A[i];

            }
        }
        return max;
    }

    public static int sum(int A[]) {
        int sum =0;
        for(int i =0 ;i<A.length ;i++){
            sum = sum + A[i];

        }
        return sum;
    }

    public static boolean SplitSubArray(int A[],int mid , int K ) {
        int count =1;
        int sum =0;
        for(int  i=0 ;i<A.length ;i++){
            if(sum+A[i]>mid){
                count++;
                sum = A[i];
            }
            else{
                sum = sum + A[i];
            }
        }
        if(count>K){
            return true;
        }
        else{
            return false;
        }
    }

    public static int Painter(int A [] , int K) {
       // Arrays.sort(A);
        int start = Max(A);
        int end = sum(A);
        int ans = -1;
        
        while(start<=end){
            int mid = start +(end-start)/2;
            boolean bhav = SplitSubArray(A, mid, K);
            if(bhav==true){
                ans = mid;
                start = mid+1;
            }
            else{
                end =mid-1;
            }

        }
        return ans;
    }
}
