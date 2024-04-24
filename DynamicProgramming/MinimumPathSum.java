public class MinimumPathSum {
// find the minimum energy required form going from one corner of the grid to another corner//
    public static int PathSum(int i , int j , int arr[][], int ans[][]) {
        if(i==0 && j ==0 ){
            return arr[0][0];
        }
        if(i<0 || j<0){
            return (int) 1e9;
        } 
        if(ans[i][j]!=-1){
            return ans[i][j];
        }

        int up = arr[i][j] + PathSum(i-1, j, arr, ans);
        int left = arr[i][j] + PathSum(i, j-1, arr, ans );

        return ans[i][j] = Math.min(up, left);
    }
    public static void main(String[] args) {
        int arr[][] = {
            {5,9,6},
            {11,5,2},
        };
        int ans[][] ={
            {-1,-1,-1},
            {-1,-1,-1}
        };

        System.out.println(PathSum(1, 2 , arr , ans));
    }
}
