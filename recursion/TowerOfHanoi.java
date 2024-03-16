public class TowerOfHanoi {


    public static void main(String[] args) {
        int N  =  3;
        int A = 10;
        int B = 11;
        int C = 12 ;

        Toh(N, A, B, C);
    }

    public static void Toh(int N , int A  , int B , int C ) {
        if(N ==0 ){
            return;
        }
       Toh(N-1 , A , C ,B);
       System.out.println( N + "[" + A + "=>" + C  + ']');
       Toh(N-1, A, B, C);
    }
}
