import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Eff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();

        
        for(int i =0;i<TestCases ;i++){
            int Teams = sc.nextInt();
            ArrayList<Integer> ans = new ArrayList<>(); 
            for(int j =0 ;j<Teams-1 ;j++){
                int score = sc.nextInt();
                ans.add(score);
            }
            int sum =0;
            for(int j =0;j< ans.size() ;j++){
                sum += ans.get(j);
            }
            System.out.println(sum*(-1));

        }
        Collections.sort(ans , new Comparator<T>() {
            
        });
    }
}

