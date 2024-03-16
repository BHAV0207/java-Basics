import java.util.*;

	class TreeNode {
	    public int data;
	    public TreeNode left;
	    public TreeNode right;

	    TreeNode(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}


class Solution {
    
    public static int KthLargestNumber(TreeNode root , int k ) {
        ArrayList<Integer> list = new ArrayList<>();
        InTrav(root, list);
        
        return list.get(list.size()- k );
    }

    private static void InTrav(TreeNode root , ArrayList<Integer> ans) {
        if (root == null)
            return;
        InTrav(root.left ,ans);
        ans.add(root.data);
        InTrav(root.right, ans);

    }
}