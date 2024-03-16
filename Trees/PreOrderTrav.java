
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
       this.val = val;
        this.left = null;
        this.right = null;
    }
}

 class getPreOrderTrav{
    public static ArrayList<Integer> preTrav(TreeNode root) {
        ArrayList<Integer> in = new ArrayList<Integer>();
        if(root == null) return in;

        inHelper(root, in);
        return in;

    }


           

public static void inHelper(TreeNode root, ArrayList<Integer> in) {
    if (root == null)
        return;

    in.add(root.val);
    inHelper(root.left, in);
    inHelper(root.right, in);

}
} 





