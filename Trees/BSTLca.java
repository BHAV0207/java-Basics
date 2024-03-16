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


public class BSTLca {

    public static int Lca(node root ,node x ,node y) {
        if(root == null){
            return root.val;
        }

        int curr = root.val;

        if(curr  < x.val && curr< y.val){
           return Lca(root.right , x ,y);
        }
        if(curr > x.val && curr > y.val){
            return Lca(root.left, x, y);
        }


        return root.val;


        
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

        System.out.println(Lca(root, root.left.left.left, root.right.right));
     }
}
