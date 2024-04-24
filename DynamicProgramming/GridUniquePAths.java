// reach from top left cell to bottom right cell in the all possible ways and return the count of those ways....//

public class GridUniquePAths {
    public static int GridUniquePath(int arr[][] , int i , int j) {
        if(i ==0 && j ==0 ){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        
        if(arr[i][j] != -1 ){
            return arr[i][j];
        }

        int up = GridUniquePath(arr, i-1, j);
        int left = GridUniquePath(arr, i, j-1);

        return arr[i][j] = up + left;

    }
    public static void main(String[] args) {
        int n =2;
        int m =2;
        int[][] ans = new int[n][m];
        for(int i =0 ;i<n ;i++){
            for(int j =0 ; j<m ;j++){
                ans[i][j] = -1;
            }
        }

        System.out.println(GridUniquePath(ans, n-1, m-1));
    }
}
