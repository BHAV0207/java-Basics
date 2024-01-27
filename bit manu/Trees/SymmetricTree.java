 
 class BinaryTreeNode {
 int data;
 BinaryTreeNode left;
 BinaryTreeNode  right;
 
 public BinaryTreeNode(int data) {
 this.data = data;
 }
 }


class Solution {

    public static boolean isSymmetric(BinaryTreeNode root) {
        if (root == null)
            return true;
        return checkSymmetric(root.left, root.right);
    }

    private static boolean checkSymmetric(BinaryTreeNode left, BinaryTreeNode right) {
        if (left == null && right == null)
            return true;
        else if (left == null || right == null)
            return false;

        else if (left.data != right.data)
            return false;

        else
            return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }
}
}}