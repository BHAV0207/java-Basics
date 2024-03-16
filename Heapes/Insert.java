import java.util.ArrayList;
import java.util.Arrays;

public class Insert {
    public static ArrayList<Integer> swap(int n , ArrayList<Integer> ans , int parent)  {
        int temp =  ans.get(n);
        ans.set(n,ans.get(parent));
        ans.set(parent, temp);

        return ans;
    }


    public static ArrayList<Integer> Insrt(ArrayList<Integer> ans , int A)  {   
        int n = ans.size();
        ans.add(A);

        while(n>0){
            int parent = (n-1)/2;
            if(ans.get(n)>ans.get(parent)){
                swap(n, ans, parent);
                n = parent;
            }else{
                return ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(50,40,45, 30,20,35 ,10));

         ArrayList<Integer> bhavv = Insrt(ans, 90);

        for(int i =0 ;i <bhavv.size() ;i++){
            System.out.print(bhavv.get(i) + " ");
        }

    }
    
}