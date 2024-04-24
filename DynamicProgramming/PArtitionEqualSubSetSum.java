// devide the array into two arrays having the same sum;
public class PArtitionEqualSubSetSum {
    public static int sum(int arr[]) {
        int sum =0;
        for(int i =0 ;i<arr.length ;i++){
            sum = sum + arr[i];
        }

        return sum;
    }
    public static boolean EqualSum(int index ,int targetSum , int arr[] , int matrix[][]) {
        if((targetSum&1) != 0){
            return false;
        }
        if(targetSum ==0 ){
            return true;
        }
        if(index ==0){
            return arr[index] == targetSum;
        }
        if(matrix[index][targetSum] != -1){
            return matrix[index][targetSum] ==0 ?false : true;
        }

        boolean notPick = EqualSum(index-1,targetSum, arr, matrix);
        boolean pick = false;
        if(targetSum>= arr[index]){
            pick = EqualSum(index-1, targetSum- arr[index], arr, matrix);
        }

        matrix[index][targetSum] = pick || notPick ?0:1;

        return pick||notPick;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = sum(arr);
        

    }
}
