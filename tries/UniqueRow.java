class node{
    node ans[];
    int cnt;
    int ew;

    node(){
        ans = new node[2];
        cnt =0;
        ew =0;
    }

    boolean hasChild(int A){
        return ans[A]!= null;
    }

    node getChild(int A){
        return ans[A];
    }

    void insertChild(int A){
        ans[A] = new node();
    }
}

class trie{
    node root;

    trie(){
        root = new node();
    }

    void insert(int []B){
        node curr = root;
        for(int i =0;i<B.length ;i++){
            int indx = B[i];
            if(!curr.hasChild(indx)){
                curr.insertChild(indx);
            }
            curr = curr.getChild(indx);
            curr.cnt++;
        }
        curr.ew++;
    }

    int search(int []B){
        node curr = root;
        for(int i =0 ;i<B.length ;i++){
            int indx = B[i];
            if()
        }
    }
}


public class UniqueRow {
    
}
