public class AAAAAAStockBuySellTWO {
    public static int buySell(int indx , int buy , int cap , int arr[] , int dp[][][] , int n) {
        if(indx == n){
            return 0;
        }
        if(cap == 0){
            return 0;
        }

        if(dp[indx][buy][cap] != -1){
            return dp[indx][buy][cap];
        }

        int profit = 0;
        if(buy ==1){
            profit = Math.max(-arr[indx] + buySell(indx+1, 0, cap, arr, dp, n), 0 + buySell(indx+1, 1, cap, arr, dp, n)); 
        }
        else{
            profit = Math.max(arr[indx] + buySell(indx+1, 1, cap-1, arr, dp, n), 0+ buySell(indx+1, 0, cap, arr, dp, n));
        }

        return dp[indx][buy][cap] = profit;

        
    }
    public static void main(String[] args) {
        
    }
}
