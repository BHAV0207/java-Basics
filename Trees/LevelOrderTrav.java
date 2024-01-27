import java.util.*;


	class node{
		int val;
		node left;
		node  right;

		public node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

 class Solution {

    public static ArrayList<Integer> getLevelOrder(node root) {
        // Your code goes here
        if (root == null)
            return new ArrayList<>();

        Queue<node> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            node curr = q.poll();
            if(curr == null){
                if(q.isEmpty()){
                    return new ArrayList<>();
                }
                q.add(null);
                System.out.println();
                continue;
            }
            
            arr.add( root.val);
             
            if (root.left != null)
                q.add(root.left);
            if (root.right != null)
                q.add(root.right);
        }
        return arr;
    }

}