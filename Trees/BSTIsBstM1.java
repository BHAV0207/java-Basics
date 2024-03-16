import java.util.ArrayList;

class node
{

    int val;
    node left;
    node right;

    node(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


public class BSTIsBstM1 {

     public void InTrav(node root ,  ArrayList<Integer> ans){
        if(root ==null){
            return ;
        }
        InTrav(root.left, ans);
        ans.add(root.val);
        InTrav(root.right ,ans);

    }
    public boolean isValidBST(node root) {
        ArrayList<Integer> list =  new ArrayList<>();
        InTrav(root ,list);

        for(int i =0 ;i<list.size()-1 ;i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(6);
        root.left.left = new node(4);
        root.left.left.left = new node(2);
        root.left.right = new node(8);
        root.left.left.right  = new node(3);
        root.right = new node(13);
        root.right.right = new node(14);
        root.right.left = new node(12);

        

     }
}
