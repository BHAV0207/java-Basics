public class DifferentBitsSumPairwise {
    public static void main(String[] args) {
        int A[] = {1,3,5};
            System.out.println(MaxAnd(A));
     }

     public static int MaxAnd(int A[]) {
        long count =0;
        int BitCheck = 0;
        long sum =0;

        for(int i =31 ;i>=0 ;i--){
            count =0;
            BitCheck = 1<<i;

            for(int j =0 ;j<A.length ;j++){
                if((A[j]&BitCheck)>0){
                    count++;
                }
            }
            sum =  sum + (count%1000000007)*((A.length-count)%1000000007)*2%1000000007;
            
        }
        int temp = (int)(sum%1000000007);
        return temp;
     }
}
