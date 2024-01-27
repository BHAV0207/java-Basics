


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
}

class Solution {

    public static int findCeil(TreeNode node, int x) {

        int ceil = -1;
        while (node != null) {
            if (node.data == x) {
                ceil = node.data;
                return ceil;
            } else if (node.data > x) {
                ceil = node.data;
                node = node.left;
            } else if (node.data < x)
                node = node.right;
        }

        return ceil;
    }
}