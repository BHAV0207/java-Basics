import java.util.*;


     class node {
        int data;
        node left;
        node right;

        node(int data){
             this.data = data; 
             this.left = null;
             this.right = null;
            }
    }



class AAAAIterativeInOrder{
    public static void getInOrderTraversal(node root) {

        //iteraative approach
    
       // List<Integer> trav = new ArrayList<Integer>();
        Stack<node> pickup = new Stack<node>();
        node node = root;

        // while (true) {
        //     if (node != null) {
        //         pickup.push(node);
        //         node = node.left;
        //     } else {
        //         if (pickup.isEmpty())
        //             break;
        //         node = pickup.pop();
        //         trav.add(node.data);
        //         node = node.right;
        //     }
        // }

        // return trav;
        while(true){
            if(node != null){
                pickup.push(node);
                node = node.left;
            }
            else{
                if(pickup.isEmpty()){
                    break;
                }
                node = pickup.pop();
                System.out.println(node.data);
                node = node.right;
            }
        }
    }


    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(6);
        root.left.left = new node(4);
        root.left.left.left = new node(2);
        root.left.right = new node(8);
        root.left.left.right  = new node(3);
        root.right = new node(13);
        root.right.right = new node(14);
        root.right.left = new node(12);

        getInOrderTraversal(root);

     }
   

}