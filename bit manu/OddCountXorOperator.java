public class OddCountXorOperator{
    public static void main(String [] args){
        int[] A = {1,1,1,1,2,2,3,2,2,4,4,4,4,5,5};
        System.out.println(findNo(A));

    }

    public static int findNo(int[] A){
        int ans = A[0];
        for(int i = 1 ;i < A.length ;i++){
            ans = ans^A[i];
        }
        return ans;
    }
}