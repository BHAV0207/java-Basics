import java.util.*;


	 class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    
	    TreeNode(int val) {
	       this.data = val;
	        this.left = null;
	        this.right = null;
	    }
	}



class Solution {
    public static List<Integer> getPreOrderTraversal(TreeNode root) {
      

        List<Integer> trav = new ArrayList<Integer>();
        if (root == null)
            return trav;

        Stack<TreeNode> pickup = new Stack<TreeNode>();
        pickup.push(root);

        while (!pickup.isEmpty()) {
            root = pickup.pop();
            trav.add(root.data);
            if (root.right != null)
                pickup.push(root.right);
            if (root.left != null)
                pickup.push(root.left);
        }

        return trav;
    }


}