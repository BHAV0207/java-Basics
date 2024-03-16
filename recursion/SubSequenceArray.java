import java.util.ArrayList;
import java.util.List;

public class SubSequenceArray {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(SubSequence(str));
    }

    public static ArrayList<String> SubSequence(String str) {

        if(str.length() == 0){
             ArrayList<String> aa = new ArrayList<>();
             aa.add("");
             return aa;

        }
        

        char first = str.charAt(0);
        String second = str.substring(1);

        ArrayList<String> list = SubSequence(second);

        ArrayList<String> ans = new ArrayList<>();

        for(String i : list){
            ans.add("" + i);

        }
        for(String i : list){
            ans.add(first + i);
        }

        return ans;

    }
}
