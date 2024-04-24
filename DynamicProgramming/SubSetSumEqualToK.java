public class SubSetSumEqualToK {
    // if any subset exist whose sum is equal to the target return true;

    public static boolean SUBSETSUM(int target , int index , int arr[] , int matrix[][]) {
        if(target == 0 ){
            return true;
        }
        if(index == 0){
            return arr[index] ==  target;
        }

        if(matrix[index][target] != -1){
            return matrix[index][target] ==0 ? false : true;
        }

        boolean notTake = SUBSETSUM(target, index-1, arr, matrix); 
        boolean take = false;
        if(target>= arr[index]){
            take = SUBSETSUM(target - arr[index], index-1, arr, matrix);
        }
        matrix[index][target] = take || notTake ? 1 : 0 ; 
        return take || notTake; 
    }
    public static void main(String[] args) {
        
    }
}
