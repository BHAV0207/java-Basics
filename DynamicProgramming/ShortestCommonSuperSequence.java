public class ShortestCommonSuperSequence {
    //in this question find the length of the combined string snd not including the common characters//
    public static int func(int i , int j , String s , String t , int matrix[][]) {
        if(i==0 || j ==0 ){
            return 0;
        }
        if(matrix[i][j] != -1){
            return matrix[i][j];
        }

        if(s.charAt(i)== t.charAt(j)){
            return matrix[i][j] = 1+ func(i-1, j-1, s, t, matrix);
        }
        else{
            return matrix[i][j] = 0 + Math.max(func(i-1, j, s, t, matrix), func(i, j-1, s, t, matrix));
        }
    }
    public static void main(String[] args) {
        //let these be length of the strings s & t;
        int s = 10;
        int t = 15;
        // length of super sting = length of sting 1 + length of  string 2 - length of longest common sub sequence 
        System.out.println(s+t- func(s.length() -1, t.length()-1,s, t, matrix));
    }
}
