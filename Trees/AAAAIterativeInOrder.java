import java.util.*;


     class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
             this.data = val; 
             this.left = null;
             this.right = null;
            }
    }



class Solution {
    public static List<Integer> getInOrderTraversal(TreeNode root) {
    
        List<Integer> trav = new ArrayList<Integer>();
        Stack<TreeNode> pickup = new Stack<TreeNode>();
        TreeNode node = root;

        while (true) {
            if (node != null) {
                pickup.push(node);
                node = node.left;
            } else {
                if (pickup.isEmpty())
                    break;
                node = pickup.pop();
                trav.add(node.data);
                node = node.right;
            }
        }

        return trav;
    }

    public void inHelper(TreeNode root, List<Integer> in) {
        if (root == null)
            return;

        inHelper(root.left, in);
        in.add(root.data);
        inHelper(root.right, in);
    }

}