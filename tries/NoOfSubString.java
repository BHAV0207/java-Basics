class node{

    /*
doubt 
*/

    node ans[];

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


public class NoOfSubString {
    node root;

    NoOfSubString(){
        root = new node();
    }

    public int main(String s) {
        int cnt =0;
        node curr = root;  
        for(int i =0 ;i<s.length() ;i++){
            char indx = s.charAt(i);
            if(!curr.hasChild(indx)){
                curr.addChild(indx);
            }
            cnt++;
            curr = curr.getChild(indx);
        }
        return cnt+1;
    }
}
