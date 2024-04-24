
public class GridUniquePaths2 {
    public static int  Grid(int i , int j , int arr[][]) {
        if(i>=0 && j>= 0 && arr[i][j] ==-1 ){
            return 0;
        }
        if(i==0 && j==0){
            return 1;

        }
        if(i<0 || j<0){
            return 0;
        }

        int up = Grid(i-1, j, arr);
        int left = Grid(i, j-1, arr);

        return  up + left; 
    }
    public static void main(String[] args) {
       
    }
}
