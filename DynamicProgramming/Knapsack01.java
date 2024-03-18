public class Knapsack01 {

    // recursive code with help of choice diagram
    public static int Knapsack(int wt[] , int value[] , int w , int n) {
        if(n ==0 || w ==0 ){
            return 0;
        }

        if(wt[n-1] <= w ){
            return Math.max(value[n-1] + Knapsack(wt ,value, w - wt[n-1] , n-1), Knapsack(wt, value , w , n-1));
        }
        else{
            return Knapsack(wt, value , w , n-1);
        }
    }



    // recursive + memorised diagram ie Dynamic programming

    int Arr[][] = new int[101][1001];
    for(int i =0 ;i<Arr.length ;i++){
        for(int j =0 ;j<Arr[0].length ;i++){
            Arr[i][j] =-1;
        }
    }

    public static int KnapsackDP(int wt[] , int value[] , int w , int n) {
        if(n ==0 || w == 0){
            return 0;
        }

        if(Arr[n][w] != -1){
            return Arr[n][w];
        }

        if(wt[n-1]<=w ){
            return Arr[n][w] = Math.max(value[n-1] + Knapsack(wt , value , w - wt[n-1] , n-1), Knapsack(wt , value, w , n-1));
        }
        else{
            return Arr[n][w] = Knapsack(wt , value , w , n-1);
        }
    }



    // dp top down approach ie converting recursion to iterative approach

   
    public static int KnapsackTopDown(int wt[] , int value[] , int w , int n) {
        int Arr[][] = new int[n+1][w+1];
        for(int i =0 ;i<n+1 ;i++){ 
            for(int j =0 ;j<w+1 ;i++){
                if(i==0 || j ==0){
                    Arr[i][j] = 0;
                }
            }
        }
        for(int i =1; i<n+1 ;i++){
            for(int j =1 ; j<w+1  ;j++){
                if(wt[i-1] <= j){
                    Arr[i][j] = Math.max(value[n-1] + Arr[n-1][j - wt[i -1]], Arr[n-1][j]);
                }
                else{
                  Arr[i][j]  = Arr[n-1][j];
                }
            }
        }

        return Arr[i][j];
        
    }
    public static void main(String[] args) {
        
    }
}
