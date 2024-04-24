public class AAAAAFallingPathSum {
    // going from bottom to up ie last row to the first row ;
     
    public static int MaxSum(int i , int j , int arr[][] , int ans[][]) {
        //n is the row size , m is the column size ;
        if(i == 0){
            return arr[i][j];
        }
        if(j<0 || j>=arr[0].length){
            return (int)-1e9;
        }
        if(ans[i][j] != -1){
            return ans[i][j];
        }
        int up = arr[i][j] + MaxSum(i-1, j, arr, ans);
        int topleft = arr[i][j] + MaxSum(i-1, j-1, arr, ans);
        int toprighr = arr[i][j] + MaxSum(i-1, j+1, arr, ans);

        return ans[i][j] = Math.max(topleft,Math.max(up, toprighr));
    }
    public static void main(String[] args) {
        
    }
}
