import java.util.ArrayList;
import java.util.Arrays;

public class Deletion {


    public static ArrayList<Integer> swap(ArrayList<Integer> ans ,int n , int b ) {
        int temp  = ans.get(b);
        ans.set(b, ans.get(n));
        ans.set(n, temp);


        return ans;
    }

    public static ArrayList<Integer> del(ArrayList<Integer> ans) {
        int n = ans.size()-1;
        swap(ans , n , 0 );
        ans.remove(n);
      //  int AA = ans.size();
        int i =0;
        while(true){
            int left = i*2+1;
            int right = i*2 +2;

            int larger = i;
            if(left<ans.size() && ans.get(left)>ans.get(larger)){
                larger = left;
            }
            if( right<ans.size() && ans.get(right)>ans.get(larger)){
                larger = right;
            }

            

            if(i == larger){
                break;
            }
            swap(ans, i, larger);
            i = larger;
        
        }
        return ans;
    }
     public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(50,40,45, 30,20,35 ,10));

         ArrayList<Integer> bhavv = del(ans);

        for(int i =0 ;i <bhavv.size() ;i++){
            System.out.print(bhavv.get(i) + " ");
        }

    }

}
