public class StockBuySell {
    // here you can buy and sell as many times as you want but in sequence;
    public static int buySell(int indx , int buy , int arr[] , int dp[][] , int n) {
        // buy can be only 1 or 0;
        if(indx == n){
            return 0;
        }
        if(dp[indx][buy]!= -1){
            return dp[indx][buy];
        }
        int profit =0;
        if(buy==1){
            profit = Math.max(-arr[indx] + buySell(indx+1, 0, arr, dp, n), 0 + buySell(indx+1, 1, arr, dp, n));
        }
        else{
            profit = Math.max(arr[indx] + buySell(indx+1, 1, arr, dp, n),  0+ buySell(indx+1,0 , arr, dp, n));
        }

        return dp[indx][buy] = profit;
    }
    public static void main(String[] args) {
        
    }
}
