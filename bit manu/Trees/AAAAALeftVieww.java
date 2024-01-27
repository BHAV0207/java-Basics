import java.util.*;

    class node
    {
    
        int data;
        node left;
        node right;

        node(int data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    }




 public class AAAAALeftVieww{
    public static ArrayList<Integer> leftView(node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<node> q = new LinkedList<>();

        if(root == null){
            return list;
        }
        
        q.add(root);

        while(!q.isEmpty()){
            ArrayList<Integer> ans = new ArrayList<>();
            int size = q.size();
            
            for(int i =0  ;i<size ;i++){
                node curr = q.poll();
                ans.add(curr.data);

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            
            list.add(ans.get(0));
        }
        return list;
    }

    public static void main(String[] args) {
        node root = new node(0);
        root.left =  new node(1);
        root.right = new node(2);
        root.left.right =  new node(3);
        root.right.right = new node(4);
        root.left.left =  new node(5);
        root.right.right = new node(6);

    

    System.out.println(leftView(root));

    }
}