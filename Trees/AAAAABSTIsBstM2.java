class data{
    boolean bst;
    int min;
    int max;

    public data(boolean bst ,int max , int min){
        this.bst = bst;
        this.max =max ;
        this.min = min;
    }
}

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

public class AAAAABSTIsBstM2 {

    public static data IsBst (node root) {
        if(root == null){
            return new data(true, Integer.MAX_VALUE , Integer.MIN_VALUE);
        }
        data l = IsBst(root.left);
        data r = IsBst(root.right);

        if(l.IsBst) && r.IsBst && root.val > l.max && root.val<r.min){
            return new data(true , max(root.val , l.max , r.max) ,min(root.val , l.min , r.min) );
        }

        return new data(false,  max(root.val , l.max , r.max) ,min(root.val , l.min , r.min));

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

        

     }
}
