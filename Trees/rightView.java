import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class node {
    int val ;
    node right ;
    node left;

    public node(int val){
        this.val=val;
        this.left = null;
        this.right = null;
    }
}
public class rightView {

   
    public static ArrayList<Integer> rightVi(node root) {
    
        Queue<node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }

        queue.add(root);
    
        while(!queue.isEmpty()) {
    
            ArrayList<Integer> levelList = new ArrayList<>();
    
            int size = queue.size();
    
            for(int i = 0; i < size; i++){
                node curNode = queue.poll();
    
                if(curNode.left != null) queue.add(curNode.left);
                if(curNode.right != null) queue.add(curNode.right);
    
                levelList.add(0,curNode.val);
    
            }
    
            list.add(levelList.get(0));
   
    
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

    //    ArrayList<Integer> ans = (rightVi(root));
    //    for(int i : ans){
    //     System.out.print(i);
    //    }

    System.out.println(rightVi(root));

    }
}




    

//     return list;
// }


//     public static ArrayList<Integer> rightVi(node root){
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         ArrayList<Integer> ans = new ArrayList<>();

//         list = LevelOrderTrav(root);

//         System.out.println(list.toString());

//         for(ArrayList<Integer> i : list){
//            ans.add(i.get(i.size() - 1));
//         }


//         return ans;

        
//     }
