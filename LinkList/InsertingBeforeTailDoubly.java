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


public class InsertingBeforeTailDoubly {

    public static node InsertBeforeHead(node head , int val) {
        node bhav = new node(val, head, null);
        head.prev = bhav;
        
        return bhav;
    }

    public static node AddBeforeTail(node head ,int val) {
        if(head.next == null){
            return InsertBeforeHead(head, val);
        }
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        node pichla =  temp.prev;
        node bhav = new node(val, temp, pichla);
        pichla.next = bhav;
        temp.prev = bhav;

        return head;

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
        node bhav = new node(1);
        
    }
}
