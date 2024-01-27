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



class Solution {
    public static List<Integer> getPostOrderTraversal(TreeNode root) {
       
        // List<Integer> in = new LinkedList<Integer>();
        // if(root == null) return in; # 1

        // inHelper(root, in);
        // in.addAll(inorderTraversal(root.left)); # 1
        // in.addAll(inorderTraversal(root.right)); # 1
        // in.add(root.val); # 1
        // return in;

        List<Integer> trav = new ArrayList<Integer>();
        Stack<TreeNode> pickup = new Stack<TreeNode>();

        if (root == null)
            return trav;
        TreeNode node = root;

        while (node != null || !pickup.isEmpty()) {
            if (node != null) {
                pickup.push(node);
                node = node.left;
            } else {
                TreeNode temp = pickup.peek().right;
                if (temp == null) {
                    temp = pickup.pop();
                    trav.add(temp.data);

                    while (!pickup.isEmpty() && temp == pickup.peek().right) {
                        temp = pickup.pop();
                        trav.add(temp.data);
                    }
                } else
                    node = temp;
            }
        }
        return trav;
    }

   
}