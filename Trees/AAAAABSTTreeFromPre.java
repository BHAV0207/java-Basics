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


public class AAAAABSTTreeFromPre {

    public static int B = 0;
    public static node BST(int A[] , int l  ,int r) {
        if(B >= A.length  || l >A[B] || r< A[B] ){
            return null;
        }
        node root = new node(A[B++]);
        root.left = BST(A, l, root.val);
        root.right =BST(A, root.val , r);

        return root;



    }


    public static node main(int A[]) {
         int n = A.length;
         int l = Integer.MIN_VALUE;
         int r = Integer.MAX_VALUE;

         return BST(A, l, r);

    }

    public static void main(String[] args) {
      int AA[] = {30,20,10,15,25,23,39,35,42};

        

     }
    
}
