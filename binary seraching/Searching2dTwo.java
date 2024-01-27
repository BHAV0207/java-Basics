public class Searching2dTwo {
    public static void main(String[] args) {
        int A [][] = {{1,4,7,11,15},
                        {2,5,8,12,19},
                    {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        int B = 14;
        System.out.println(Search(A, B));
    }

    public static int Search(int A[][] , int B) {
        int row = 0;
        int col = A[0].length-1;

        while(row<A.length && col>=0){
            if(A[row][col]==B){
                return 1;
            }
            else if(A[row][col]>B){
                col--;
            }
            else{
                row++;
            }
        }
        return -1;
    }
}
