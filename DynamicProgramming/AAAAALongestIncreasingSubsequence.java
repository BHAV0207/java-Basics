public class AAAAALongestIncreasingSubsequence {

    public static int LIS(int indx , int prev , int arr[] ,int dp[][] ) {
        if(indx == arr.length){
            return 0;
        }
        if(dp[indx][prev+1]!= -1){
            return dp[indx][prev+1];
        }

        int length = 0 + LIS(indx+1, prev, arr, dp);
        if(prev == -1 || arr[indx] > arr[prev]){
            length = Math.max(length, 1 + LIS(indx+1, indx , arr, dp));
        }

        return dp[indx][prev+1] = length;
    }
    public static void main(String[] args) {
          
    }
}
