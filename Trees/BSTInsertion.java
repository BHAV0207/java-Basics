class node
{

    int val;
    node left;
    node right;

    node(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTInsertion{
    public static node Insertion(node root , int x) {
        if(root==  null){
            return new node(x);
        }
        node curr = root;
        
        while(true){
            if(curr.val< x){
                if(curr.right != null){
                    curr = curr.right;
                }
                else{
                    curr.right = new node(x);
                    break;
                }
            }
            else{
                if(curr.left != null){
                    curr =  curr.left;
                }
                else{
                    curr.left = new node(x);
                    break;
                }
            }
        }

        return root;
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

        System.out.println(Insertion(root, 8));

     }
}