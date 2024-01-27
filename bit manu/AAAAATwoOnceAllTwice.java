public class AAAAATwoOnceAllTwice {
    public static void main(String[] args) {
        int []A = {1,1,2,2,3,4,5,5};
        int B[] = UniqueNo(A);
        for(int i =0 ; i<2 ;i++){
            System.out.println(B[i]);
        }
    }

    public static int[] UniqueNo(int A[]) {
        int ans = 0;
        for(int i =0;i<A.length ;i++){
            ans =  ans^A[i];
        }

        int p =0;
        for(int i =0 ;i<A.length ;i++){
           int x = (ans>>i)&1;
           if(x==1){
            p =i;
            break;
           } 
        }

        int s1=0;
        int s2 =0;
        for(int i =0;i<A.length ;i++){
            if(((A[i]>>p)&1)==1){
                s1 = s1^A[i];
            }
            else{
                s2 = s2^A[i];
            }
        }

        int bhav[] = new int[2];
        bhav[0] = s1;
        bhav[1] = s2;

        return bhav;
    }
}
