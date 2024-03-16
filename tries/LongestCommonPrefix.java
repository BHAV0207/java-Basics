class node{
    node ans[];
    boolean  bool = false;
    int WordCount= 0;

    node(){
        ans = new node[26];
    }
    boolean hasChild(char ch){
        return ans[ch -'a']!= null;
    }
    node getChild(char ch){
        return ans[ch -'a'];
    }
    void addChild(char ch){
        ans[ch - 'a'] = new node();
    }
}


public class LongestCommonPrefix {
    node root;

    LongestCommonPrefix(){
        root = new node();
    }

    public void Insert(String s) {
        node curr = root;
        curr.WordCount++;

        for(int i =0 ;i<s.length() ;i++){
            char indx = s.charAt(i);
            if(!curr.hasChild(indx)){
                curr.WordCount++;
                curr.addChild(indx);
                curr.WordCount++;
            }
            curr = curr.getChild(indx);

        }
        curr.bool = true;
    }

    public String SearchLongest(String[] args) {
        for(int i =0 ;i<args.length ;i++){
            Insert(args[i]);
        }

        StringBuilder ans = new StringBuilder();

        node curr = root;
        while(curr!= null){
            boolean bool = false;
            for(char ch = 'a' ; ch<= 'z' ; ch++){
                if(curr.getChild(ch)!= null && root.WordCount == curr.WordCount){
                    ans.append(ch);
                    bool = true;
                    curr = curr.getChild(ch);
                    break;
                }
            } 
            if(!bool){
                break;
            }
        }
        return ans.toString();
    }
}
