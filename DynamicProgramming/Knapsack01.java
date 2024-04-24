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

    public static int KnapsackDP(int matrix[][] , int wt[] , int value[] , int w , int indx) {
        if(indx ==0){
            if(wt[indx]<= w){
                return value[indx];
            }
            else{
                return 0;
            }
        }

        if(matrix[indx][w] != -1){
            return matrix[indx][w];
        }

        int notPick = 0 + KnapsackDP( matrix , wt, value, w, indx-1);
        int pick = Integer.MIN_VALUE;
        pick = value[indx] + KnapsackDP(matrix, wt, value, w - wt[indx], indx-1);

        return matrix[indx][w] = Math.max(notPick, pick);
    }
    public static void main(String[] args) {
        int Arr[][] = new int[101][1001];
        for(int i =0 ;i<Arr.length ;i++){
            for(int j =0 ;j<Arr[0].length ;i++){
                Arr[i][j] =-1;
            }
        }

    }
}
