public class KnapSack {
    public static float[]  maxProfitPercentage(float A[] , float B[]) {
        float maxProfit[] = new float[A.length];
        for(int i =0;i<A.length ;i++){
            maxProfit[i] = A[i]/B[i];
        } 

        return maxProfit;
    }

    

    public static void main(String[] args) {
        float obj[] = new float[7];
        float weight[] = {2,3,5,7,1,4,1};
        float[] profit = {10,5,15,7,6,18,3};
        int N = 15;
       obj = maxProfitPercentage(profit, weight);



    }
    
}