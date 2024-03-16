public class Factorial {
    public static void main(String[] args) {
        int N =5;
       System.out.println(fact(5)); 
    }
    public static int fact(int N) {
        if(N == 1){
            return 1;
        }
        int A = N*fact(N-1);
        return A;
    }
}
