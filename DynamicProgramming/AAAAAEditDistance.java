public class AAAAAEditDistance {
    public static int EditDistace(int i , int j , String s , String t, int matrix[][]) {
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }

        if(matrix[i][j] != -1){
            return matrix[i][j];
        }

        if(s.charAt(i) == t.charAt(j)){
            return matrix[i][j]= EditDistace(i-1, j-1, s, t, matrix);
        }
        else{
            return matrix[i][j] = 1+ Math.min(EditDistace(i-1, j, s, t, matrix), Math.min(EditDistace(i-1, j-1, s, t, matrix), EditDistace(i, j-1, s, t, matrix)));
        }
        
    }
    public static void main(String[] args) {
        
    }
}
