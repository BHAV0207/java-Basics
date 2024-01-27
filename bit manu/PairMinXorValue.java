public class PairMinXorValue {
    public static void main(String[] args) {
        int []A = {2,4,6,8};
        MinXor(A); 
    }

    public static void MinXor(int A[]) {
        int min = Integer.MAX_VALUE;
        int num1 =0;
        int num2 = 0;

        for(int i = 0 ;i<A.length ;i++){
            for(int j =i+1 ;j<A.length;j++){
                int x  = A[i]^A[j];
                if(min>x){
                    min = x;
                    num1 = A[i];
                    num2  =A[j];
                }
            }
        }

     System.out.println(num1);
     System.out.println(num2);

    }
}
