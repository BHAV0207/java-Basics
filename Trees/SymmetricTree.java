 
 


   /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isSymmetric(TreeNode A) {
       
         if(symm(A,A)== false){
             return 0;
         }
         return 1;

        
    }

    public boolean symm(TreeNode left , TreeNode right){
        if(left ==null && right== null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
         if(left.val != right.val){
            return false;
        }

       return((left.val == right.val) && symm(left.left ,right.right) && symm(left.right ,right.left));
       

    }

}
