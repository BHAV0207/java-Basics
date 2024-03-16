class node {
    node[] ans = new node[26];
    int ew =0;
    int cnt =0;

    public node(){
        
    }

    boolean ChildPresent(char str){
        return (ans[str -'a'] != null);
    }

    void InsertChild(char str){
        ans[str -'a'] = new node();
    }

    node getChild(char str){
        return ans[str -'a'];
    }

}

public class TrieCount {
  node root;
  
  public TrieCount(){
    root = new node(); 
  }

  void insert(String s){
    node curr = root;
    for(int i =0 ;i<s.length() ;i++){
        char indx = s.charAt(i);
        if(!curr.childPresent(indx)){
            curr.InsertChild(indx);
        }
        curr = curr.getChild(indx);
        curr.cnt++;
    }
    curr.ew++;
  }

  public int countWords(String s){
    node curr = root;
    for(int i =0;i<s.length() ;i++){
        char indx = s.charAt(i);
        if(!curr.childPresent(indx)){
            return 0;
        }else{
            curr = curr.getChild(indx);
        }
    }
    return curr.ew;
  }

  public int EndWith(String s){
    node curr = root;
    for(int i =0;i<s.length() ;i++){
        char indx = s.charAt(i);
        if(!curr.childPresent(indx)){
            return 0;
        }else{
            curr = curr.getChild(indx);
        }
    }
    return curr.cnt;
  }
}

