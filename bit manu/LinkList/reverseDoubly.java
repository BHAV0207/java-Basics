class node {
    int val;
    node next;
    node prev;

    node(int val , node next ,node prev){
        this.val =val;
        this.next = next;
        this.prev = prev;
    }

    node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class reverseDoubly {
    public static node reverse(node head) {
        if(head==null || head.next ==null){
            return head;
        }

       node curr =head;
       node pichla  = null;

        while(curr!=null){
            pichla = curr.prev;
            curr.prev = curr.next;
            curr.next = curr.prev;
            curr = curr.prev;
        }

        return pichla.prev;
    }



    public static void print(node head) {
        node temp = head;
        while(temp.next!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val);
        System.out.println();

    }


    public static node InsertBeforeHead(node head , int val) {
        node bhav = new node(val, head, null);
        head.prev = bhav;
        
        return bhav;
    }


    public static void main(String[] args) {
        

    }
}
