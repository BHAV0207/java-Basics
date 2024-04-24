public class RodCuttingProblem {
    // in this question we have to find the maximum profit by cutting the rod in all possible combinations and return the max valuye an element can be used infinite times//
    public static int rod(int target , int indx , int arr[] , int matrix[][]) {
        if(indx == 0){
            //we know that on index 0 length of rod is 1 thus to make the rod length equal to target we will add the rod target times // 
            return target*arr[indx];
        }
        if(matrix[indx][target] != -1){
            return matrix[indx][target];
        }

        int notPick = 0+ rod(target, indx-1, arr, matrix);
        int pick = Integer.MIN_VALUE;
        int rodLength = indx+1;
        if(rodLength<= target){
            //due to infinite repetition indx will not be reduced
            pick = arr[indx] + rod(target- arr[indx], indx, arr, matrix);
        }

        return matrix[indx][target] = Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        
    }
}
