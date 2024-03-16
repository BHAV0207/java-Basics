import java.util.ArrayList;
import java.util.Scanner;

public class ParseInt {
    public static int ParseInt(String N) {


        // My approach
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0 ;i<N.length() ;i++){
            if(N.charAt(i) >= 0  && N.charAt(i)<= 46){
                System.out.println("Invalid Input");
                break;
            }

            if(N.charAt(i) >= 58  && N.charAt(i)<= 127){
                System.out.println("Invalid Input");
                break;
            }

            ans.add(N.charAt(i) -'0');
        }
        int A =ans.get(0);
        for(int i =0 ;i<ans.size()-1 ;i++){
            A = A*10 +ans.get(i+1);
        }

        return A;


        // dhruv bahiya approach;

        
        // int ans = 0;
        // for(int i = 0; i < N.length(); ++i)
        // {
        //     char ch = N.charAt(i);
        //     assert(ch >= '0' && ch <= '9');
        //     int curDigit = ch - '0';
        //     ans = ans * 10 + curDigit;
        // }
        // return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(ParseInt(num));
    }
}
