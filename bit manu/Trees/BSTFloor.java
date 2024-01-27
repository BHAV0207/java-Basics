


class TreeNode
{

int data;
TreeNode left;
TreeNode right;

TreeNode(int data)
{
this.data = data;
left = null;
right = null;
}
};


class Solution {

    public static int floorInBST(TreeNode root, int X) {
        int floor = Integer.MAX_VALUE;
        // Write your code here.
        if (root == null)
            return Integer.MAX_VALUE;
        if (root.data == X)
            return X;
        if (root.data > X)
            root = root.left;
        if(root.data<= X){
            floor = root.data;
            root= root.right;
        }

        return floor;
    }
}