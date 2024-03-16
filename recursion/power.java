public class power {
    public static void main(String[] args) {
        int N =3;
        int X = 5;

        System.out.println(power(X, N));

    }

    public static int power(int X ,  int N ) {

     
       
        if(N  == 0){
            return 1;
        }

        int A = power(X , N-1);
        int B =  X*A;
        
        return B;
    }
}
