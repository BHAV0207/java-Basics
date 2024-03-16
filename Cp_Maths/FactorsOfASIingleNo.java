import java.util.Scanner;

public class FactorsOfASIingleNo {

    public static int Factor(int n) {
        int cnt =0;
        for(int i =1;i*i <n ;i++){
            if(n%i == 0){
                cnt++;
                if(i == n/i){
                    continue;
                }
                cnt++;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println(Factor(A));
    }
}

//in this code the time complexity is underoot n;