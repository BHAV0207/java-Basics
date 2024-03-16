import java.util.*;
class node{
    HashMap<Character , node> ans;
    //node ans[];
    int ew ;
    
    node(){
        ans = new HashMap<>();
       // ans = new node[26];
        ew =0;
    }
    
    boolean HasChild(char ch){
        return ans.containsKey(ch);
       // return ans[ch -'0'] != null;
    }
    
    node GetChild(char ch){
        return ans.get(ch);
       // return ans[ch-'0'];
    }
    
    void InsertChild(char ch){
        ans.put(ch , new node()); 
    }
}


class trie{
    node root;
    
    trie(){
        root = new node();
    }
    
   void insert(String s){
       node curr = root;
       for(int i =0; i<s.length() ;i++){
           char indx = s.charAt(i);
           if(!curr.HasChild(indx)){
               curr.InsertChild(indx);
           }
           curr = curr.GetChild(indx);
           curr.ew++;
       }
   }
   
   int CheckPrefix(String s){
       node curr = root;
       for(int i =0; i<s.length(); i++){
          char indx = s.charAt(i);
           if(curr.HasChild(indx)){
               curr = curr.GetChild(indx);
               if(curr.ew >1){
                   return 0;
               }
           }
       }
       
       return 1;
   }
}
public class ValidDictionary {
    public int solve(ArrayList<String> A) {
        trie temp = new trie();
        for(int i =0 ;i<A.size() ;i++){
            temp.insert(A.get(i));
        }
         HashSet<Integer> bhav = new HashSet<>();
        for(int i =0;i<A.size() ;i++){
            bhav.add(temp.CheckPrefix(A.get(i)));
        }
        
        if(bhav.contains(0)){
            return 0;
        }
        return 1;
    }
}

