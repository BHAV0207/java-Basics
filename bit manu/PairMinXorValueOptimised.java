import java.util.Arrays;

public class PairMinXorValueOptimised{
    public static void main(String [] args){
            int []A = {2,4,6,8};
            System.out.println(MinXor(A)[0] + " " +  MinXor(A)[1]);
    }

    public static int[] MinXor(int A[]) {
        int ans[] = new int[2];

        int min  = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i  = 0; i<A.length-1 ;i++){
            int x= A[i]^A[i+1];
            if (x<min) {
                min = x;
                ans[0] = A[i];
                ans[1]= A[i+1];
            }
        }
        return ans;
    }
}