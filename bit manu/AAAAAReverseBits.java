public class AAAAAReverseBits {
    public static void main(String[] args) {
        long A = 3;
        System.out.println(Reverse(A));
    }

    public static long Reverse(long A) {
        long ans =0L;
        for(int i = 0 ;i<32 ;i++){
           ans = ans<<1 |A&1;
           A>>=1;
        }
        return ans;
    }
}
