public class Triangle {
    // int this question we will go from top to bottom ie i=0  j=0; to last 
    public static int TRIA(int i , int j ,int n , int arr[][], int ans[][]) {
        if(i == n-1){
            return arr[i][j];
        }
        if(ans[i][j] !=-1){
            return ans[i][j];
        }
        int down = arr[i][j] +  TRIA(i+1, j, n, arr, ans);
        int DigonalDown = arr[i][j] + TRIA(i+1, j+1, down, arr, ans);


        return ans[i][j] = Math.min(down, DigonalDown);
    }
    public static void main(String[] args) {
        
    }
}
