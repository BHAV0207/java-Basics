import java.util.ArrayList;

class node{
    node [] ans ;

    node(){
        ans = new node[2];
    }

    public boolean hasChild(int A) {
        return ans[A]!= null;
    }

    public node getChild(int A){
        return ans[A];
    }

    public void InsertChild(int A){
         ans[A] = new node();
    }
}



class trie{
    node root;

    trie(){
        root = new node();
    }

    public void Insert(int B) {
        node curr = root;
        for(int i =31 ; i>=0 ;i--){
            int bit  = (B>>i) &1;
            if(!curr.hasChild(bit)){
                curr.InsertChild(bit);
            }
            curr = curr.getChild(bit);
        }    
    }

    public int MaxXorEle(int B){
        node curr = root;
        int maxele =0;
        for(int i =31 ;i>=0 ;i--){
            int bit = (B>>i) &1;
            if(curr.hasChild(1-bit)){
                maxele = maxele | (1<<i); //didn't understand well 
                curr = curr.getChild(1-bit);
            }
            else{
                curr = curr.getChild(bit);
            }
        }

        return maxele;
    }
}



public class MaxXor {
    public int Max(int n , int m ,ArrayList<Integer> A, ArrayList<Integer> B) {
        trie temp = new trie();
        for(int i =0; i<n ;i++){
            temp.Insert(A.get(i));
        }

        int maxi =0;
        for(int i =0;i<m ;i++){
           maxi = Math.max(maxi, temp.MaxXorEle(B.get(i)));
        }
        return maxi;
    }

}
