//two strings are given find the occurances of second string in first string;
public class AAAAADistinctSubSequences {

    //memoistaion will give TLE in this question thus we will ahve to do tabulation
    public static int Distinct(int i , int j , String s , String t , int matrix[][]) {
        if(i<0){
            return 0;
            // the first string gets exhausted then twe can say that there might be a chance that th second string is still left thus we are not finished . 
        }
        if(j<0){
            // second string gets exhausted thus we hace checked its all possibilites thus we are finished thus return one 
            return 1;
        }

        if(matrix[i][j] != -1){
            return matrix[i][j];
        }

        if(s.charAt(i) ==  t.charAt(j)){
            return matrix[i][j] = Distinct(i-1, j-1, s, t, matrix) + Distinct(i-1, j, s, t, matrix);
        }
        else{
            return matrix[i][j] = Distinct(i-1, j, s, t, matrix); 
        }
    }


    //tabulation approach
    public static void DistinctTabullation(String[] args) {
        
    }
    public static void main(String[] args) {
        
    }
}
