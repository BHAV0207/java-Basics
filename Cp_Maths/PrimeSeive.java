import java.util.ArrayList;
import java.util.Scanner;

public class PrimeSeive {

    public static ArrayList<Integer>  prime(boolean[] N) {
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int i =2;i<N.length ;i++){
            if(N[i] == false){
                continue;
            }
            ans.add(i);
            for(int j = i*2 ; j<N.length ;j = j+i ){
                N[j] = false;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans[] = new boolean[n+1];

        for(int i =0;i<ans.length ;i++){
            ans[i] = true;
        }
        ArrayList<Integer> finalAns = new ArrayList<>();
       finalAns =prime(ans);

       for(int i=0 ;i<finalAns.size() ;i++){
            System.out.println(finalAns.get(i));
       }


    }
}
