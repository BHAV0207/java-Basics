class node{
    int val;
    node next;
    node prev;
    node(int val , node next , node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;

    }

    node(int val){
        this.val = val;
        this.next =null;
        this.prev =null;
    }
 }
class InsertingBeforeHeadDoubly{
    public static node InsertBeforeHead(node head , int val) {
        node bhav = new node(val, head, null);
        head.prev = bhav;
        
        return bhav;
    }


    public static void print(node head) {
        node temp = head;
        while(temp.next!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val + " ");
        System.out.println();
    }

    
    public static void main(String[] args) {
        node n1 =  new node(1);
        InsertBeforeHead(n1, 5);
        InsertBeforeHead(n1, 6);

        print(n1);
    }
}