public class LongestCommonSubSequence {
    public static int LongestCommon(int i , int j ,String s , String t , int matrix[][] ) {
        if(i <0 || j<0){
            return 0;
        }
        if(matrix[i][j] != -1){
            return matrix[i][j];
        }

        if(s.charAt(i) == t.charAt(j)){
            return matrix[i][j] = 1 +LongestCommon(i-1, j-1, s, t, matrix);
        }
        else{
            return matrix[i][j] = 0+Math.max(LongestCommon(i-1, j, s, t, matrix) , LongestCommon(i, j-1, s, t, matrix));
        }
    }
    public static void main(String[] args) {
        
    }
}
