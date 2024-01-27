class node {
    int val ;
    node right ;
    node left;

    public node(int val){
        this.val=val;
        this.left = null;
        this.right = null;
    }
}

public class HeightOfTrees{
    public static int Height(node root) {
        if(root == null){
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);

        return Math.max(lh, rh)+1 ;
    }

    public static void main(String[] args) {
        node root = new node(0);
        root.left =  new node(1);
        root.right = new node(2);
        root.left.right =  new node(3);
        root.right.right = new node(4);
        root.left.left =  new node(5);
        root.right.right = new node(6);
        root.right.right.right  = new node(7);

       System.out.println(Height(root));
    }
}