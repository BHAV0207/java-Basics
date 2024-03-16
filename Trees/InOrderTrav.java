import java.util.*;

class BinaryTreeNode {
     int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

public BinaryTreeNode(int data) {
    this.data = data;
    this.right = null;
    this.left =  null;
}
}

 class Solution {
    public static ArrayList<Integer> getTreeTraversal(BinaryTreeNode root) {
       // List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> inOrder = new ArrayList<>();
        inorder(inOrder, root);

        return inOrder;
    }


    public static void inorder(List<Integer> inOrder, BinaryTreeNode root) {
        if (root == null)
            return;

        inorder(inOrder, root.left);
        inOrder.add(root.data);
        inorder(inOrder, root.right);
    }


}