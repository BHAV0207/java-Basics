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


public class AAAAALca {

    public static node Lca(node root , node p , node q) {
        if(root == null ||root == p || root == q){
            return root;
        }

        node left = Lca(root.left , p ,q);
        node right = Lca(root.right , p , q);

        if(left == null){
            return right;
        }
        else if (right == null){
            return left; 
        }
        else{
            return root;
        }

    }
    
     public static void main(String[] args) {
        node root = new node(0);
        root.left =  new node(1);
        root.right = new node(2);
        root.left.right =  new node(3);
        root.right.right = new node(4);
        root.left.left =  new node(5);
        root.right.right = new node(6);

        


    }
}
