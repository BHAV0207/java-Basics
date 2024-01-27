import java.util.*;


 class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
}

class getPostOrderTrav{
    public static  void inHelper(TreeNode root, ArrayList<Integer> in) {
        if (root == null)
            return;
    
        inHelper(root.left, in);
        inHelper(root.right, in);
        in.add(root.data);
    }


    public static List<Integer> getPostOrderTraversal(TreeNode root) {
       
        ArrayList<Integer> in = new ArrayList<Integer>();
        if(root == null) return in;

        inHelper(root, in);
        
        return in;

    }
}
