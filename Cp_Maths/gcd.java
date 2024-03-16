import java.util.Scanner;

public class gcd {
    public static int gcd(int a , int b) {
        if(a==0){
            return b;
        }
        return gcd(b%a , a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(gcd(A,B));
    }
}
