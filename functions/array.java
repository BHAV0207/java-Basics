import java.util.Scanner;
public class array{

    static void marks (int agio[]){
       int sum = 0;
       for(int i = 0 ; i<5; i++){
        sum = sum + agio[i];
       }
       System.out.print(sum);

    }
    public static void main(String [] args){
        int boy[] = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int c = 0 ; c<5; c++){
            boy[c] = sc.nextInt();
        }
        marks(boy);
    }
}   