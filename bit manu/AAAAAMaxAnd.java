public class AAAAAMaxAnd {
    public static void main(String[] args) {
       int [] A = {38, 44, 84, 12};
       System.out.println(Max(A));

    }
    public static int Max(int A[]) {
        int count =0;
        int BitCheck =0;
        int ans =0;
        for(int i =31 ;i>=0 ;i--){
            BitCheck = 1<<i;
            count =0;
            for(int j =0 ;j<A.length ;j++){
                if((A[j]&BitCheck)>1){
                    count++;
                }
            }

            if(count>=2){
                ans = ans |BitCheck;
                for(int j =0 ;j<A.length ;j++){
                    if((A[j]&BitCheck)==0){
                        A[j] = 0;
                    }
                }
            }
        }
        return ans ;
    }
}
