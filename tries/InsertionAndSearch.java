class node{
    node[] children;
    boolean eow;
    
    public node(){
        this.eow = false;

        children = new node[26];
        for(int i =0; i< 26 ; i++){
            children[i] = null;
        }
    }
}


public class InsertionAndSearch {

    public static void insert(String word , node root) {
        node curr = root;

        for(int i =0 ;i<word.length() ;i++){
            int index =  word.charAt(i)- 'a';
              
           if(curr.children[index]==null){
                node newNode = new node();
                curr.children[index] =  newNode; 
           }
           curr = curr.children[index];
        }

        curr.eow = true;
    }

    public static boolean search(String word , node root) {
        node curr = root;

        for(int i = 0 ;i<word.length() ; i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }

        return curr.eow;
    }

}