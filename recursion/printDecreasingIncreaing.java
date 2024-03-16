public class printDecreasingIncreaing {
    public static void main(String[] args) {
      int N =5 ;

      pdi(N);

    }

    public static void pdi(int N ) {
        if(N ==0 ){
            return;
        }
        System.out.println(N);
        pdi(N-1);
        System.out.println(N);
    }
}
