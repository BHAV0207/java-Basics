/**
 * EqualSumPartition
 */
public class EqualSumPartition {
    public static boolean SubsetSum(int []numbers , int size , int PartitionSum ) {
        boolean [][] matrix = new boolean[size+1][PartitionSum+1];
        for(int i =0 ;i<size+1 ;i++){
            for(int j=0 ;j<PartitionSum+1 ;j++){
                if(j == 0){
                    matrix[i][j] = false;
                }
                if(i ==0 ){
                    matrix[i][j] = true;
                }
            }
        }

        for(int i =1; i< size+1 ;i++){
            for(int j =1 ; j< PartitionSum+1 ;j++){
                if(numbers[i-1]<= j){
                    matrix[i][j] = matrix[i-1][j - numbers[i-1]] || matrix[i-1][j];
                }
                else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        return matrix[size][PartitionSum];
    }

    public static boolean sumPartition(int arr[] , int n) {
        int sum =0;
        for(int i =0 ;i<arr.length ;i++){
            sum =  sum + arr[i];
        }

        if(sum%2 != 0){
            return false;
        }
        else{
            int halfSum = sum/2;
            return SubsetSum(arr, n,  halfSum);
        }
    }



    public static void main(String[] args) {
        
    }
    
}