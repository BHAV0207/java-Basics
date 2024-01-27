class node{
    int val;
    node next;

    public node(int val)
    {
        this.val =val;
        this.next = null;
    }
}


public class reverseSingleK {

    public static void print(node head) {
        node temp = head;
        while(temp.next!=null){
            System.out.println(temp.val+" ");
            temp =temp.next;
        }
        System.out.print(temp.val + " ");
        System.out.println();
    }
    
    public static node reverse(node head , int k ) {
        node prev  =null;
        node curr =head ;
        node agla =head.next;

        int j =0;
        while(curr.next!=null && j<k){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr =agla;
            j++;
        }

        return prev;
    }
   
   public static node insertAtEnd(node head ,int val) {
        node newNode = new node(val);
        node temp =head;
        while(temp.next!=null){
            temp = temp.next;
        } 
        temp.next = newNode;

        return temp;
   }
   
   
    public static void main(String[] args) {
        node ListNode = new node(5);
        insertAtEnd(ListNode, 7);
        insertAtEnd(ListNode, 8);
        insertAtEnd(ListNode, 9);
        insertAtEnd(ListNode, 10);
        insertAtEnd(ListNode, 11);
        insertAtEnd(ListNode, 12);
        node n2 =  reverse(ListNode , 4);
        print(n2);
    }
}
