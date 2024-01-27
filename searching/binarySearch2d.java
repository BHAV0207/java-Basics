public class binarySearch2d {
    public static void main(String[] args) {
        int [][] arr = {{5,10,12,15,20},
                        {8,11,13,17,31},
                        {10,12,14,22,38},
                        {15,18,23,28,40}};
        int target = 14;
        int[] ans = search(arr, target);
        System.out.print(ans[0] + "," + ans[1]);
    }

    static int[] search(int[][]A ,int B){
        int row = 0;
        int col = A.length-1;

        while(row<A.length && col>=0){
            if(A[row][col]==B){
                return new int[] {row ,col};
            }
            else if(A[row][col]>B){
                col--;
            }
            else {
                row++;
            }
        }
        return new int[] {row,col};
    }
}
