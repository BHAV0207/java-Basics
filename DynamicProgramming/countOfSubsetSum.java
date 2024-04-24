public class countOfSubsetSum {

    public static int subset(int numbers[] , int size  ,int totalSum) {
        int matrix[][] = new int[size+1][totalSum+1];
        for(int i =0 ; i< size+1; i++){
            for(int j =0 ; j<totalSum+1 ; j++){
                if(i==0){
                    matrix[i][j] = 0; 
                }
                if(j ==0 ){
                    matrix[i][j] = 1;
                }
            }
        }

        for(int i =1;i<size+1  ; i++){
            for(int j=1; j< totalSum+1; j++){
                if(numbers[i-1] <= j){
                    // only difference from subset sum;
                    matrix[i][j] = matrix[i-1][j - numbers[i-1]] + matrix[i-1][j]; 
                }
                else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        return matrix[size][totalSum];

    }
    public static void main(String[] args) {
        
    }
    
}
