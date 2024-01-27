class node
{

    int val;
    node left;
    node right;

    node(int val) 
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class AAAAABSTDeletingEle {

    public static boolean IsLeaf(node root) {
        if(root.left == null && root.right == null){
            return true;
        }  
        return false;
    }

    public static node MaxOfSubTree(node root) {
        node curr = root;
        while(curr.right != null){
            curr = curr.right;
        }

        return curr;
    }

    public static node DelNode(node root, int x) {
        if(root == null){
            return root;
        }

        if(root.val > x){
            root.left = DelNode(root.left, x);
        }
        else if(root.val < x){
            root.right =  DelNode(root.right, x);
        }

        else{
            if(IsLeaf(root)){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            else{
                node max = MaxOfSubTree(root.left);
                root.val = max.val ;
                root.left = DelNode(root.left, max.val);
            }
        }
            return root;
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

        System.out.println(DelNode(root, 8));

     }
   
}
