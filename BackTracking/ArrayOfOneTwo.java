import java.util.ArrayList;

/**
 * ArrayOfOneTwo
 */
public class ArrayOfOneTwo {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void generate(ArrayList<ArrayList<Integer>> list , ArrayList<Integer> single, int N ) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(ans.size() == N ){
            list.add(ans);
            return;
        }

        ans.add(1);
        generate(list, ans, N);
        ans.remove(ans.size()-1);
        ans.add(2);
        generate(list, ans, N);
        ans.remove(ans.size()-1);
    }

    
}