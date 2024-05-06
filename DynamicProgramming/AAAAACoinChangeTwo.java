public class AAAAACoinChangeTwo {
    // element of the array can be used any number of times to make the target htus give the total ways to form the target;
    public static int coin(int indx , int target , int arr[] , int matrix[][]) {
        if(indx ==0){
            if(target%arr[indx] ==0 ){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(matrix[indx][target]!= -1){
            return matrix[indx][target];
        }
        int notPick =coin(indx-1, target, arr, matrix);
        int pick = 0;
        if(arr[indx]<=target){
            pick = coin(indx, target-arr[indx], arr, matrix);
        }

        return matrix[indx][target] = pick+notPick;

    }
    public static void main(String[] args) {
        
    }
}
