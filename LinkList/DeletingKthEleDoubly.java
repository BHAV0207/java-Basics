class node{
    int val;
    node next;
    node prev;

    node(int val , node next ,node prev)
    {
        this.val = val;
        this.next =next;
        this.prev =prev;
    }

    node(int val)
    {
        this.val =val;
        this.next =null;
        this.prev =null;
    }
}


public class DeletingKthEleDoubly {

    public static node DelFirstEle(node head) {
        if(head == null || head.next == null){
            return null;
        }
        node temp =head;
        head =head.next;
        temp.next =null;
        head.prev = null;


        return head;
    }

    public static node DeletingLast(node head) {

        if(head == null || head.next==null){
            return null;
        }
        node temp = head;
        while(temp.next==null){
            temp =temp.next;
        }
            node previous = temp.prev;
            previous.next = null;
            temp.prev = null;


            return head;

    }

    public static node delkNode(node head , int k) {
        node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp = temp.next;

        }

        node last = temp.prev;
        node agla =temp.next;

        if(last == null && agla==null){
            return null;
        }

        else if(last == null){
            return DelFirstEle(head);
        }
        else if(agla == null){
            return DeletingLast(head);
        }

        last.next = agla;
        agla.prev = last;
        
        temp.next =null;
        temp.prev = null;

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

    public static node insertAtStart(node head , int val) {
        node bhav = new node(val);
        node temp = head;
        if(head == null){
            head =  bhav;

            // this is yet not complete....wait for it to be completed........
        }
        
    }


    public static void main(String[] args) {
        
    }

}
