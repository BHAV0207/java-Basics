import java.util.*;
class node{
    node ans[];
    int ew ;

    node(){
        ans = new node[26];
        ew = 0;
    }

    public boolean HasChild(char ch){
        return ans[ch -'a'] != null;
    }

    public node GetChild(char ch){
        return ans[ch -'a'];
    }

    public void insertChild(char ch){
        ans[ch-'a'] = new node();
    }
}



class trie{
    node root;

    trie(){
        root = new node();
    }


    public void insert(String s){
        node curr = root;
        for(int i =0;i<s.length() ;i++){
            char indx = s.charAt(i);
            if(!curr.HasChild(indx)){
                curr.insertChild(indx);
            }
            curr = curr.GetChild(indx);
            curr.ew ++;
        }
    }

    public String UniquePrefix(String s){
        node curr = root;
        //curr.ew = 0;
        String str = "";
        for(int i =0 ; i<s.length() ; i++){
            char indx = s.charAt(i);
            if(curr.HasChild(indx)){
                curr = curr.GetChild(indx);
                if(curr.ew > 1){
                    str = str + indx;
                }
                else if(curr.ew ==1){
                    str = str+ indx;
                    break;
                }
            }
        }

        return str;
    }
}




public class UniquePrefix {
    public ArrayList<String> prefix(ArrayList<String> A) {  
        trie temp = new trie();
        for(int i =0 ;i<A.size() ;i++){
            temp.insert(A.get(i));
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i =0  ;i<A.size() ;i++){
            ans.add(temp.UniquePrefix(A.get(i)));
        }

        return ans;

       
    }
}
