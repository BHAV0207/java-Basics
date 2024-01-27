
class node{

    int val;
    node next;
    public node(int val)
    {
        this.val=val;
        this.next = null;
    }
}


public class reverseSigle {

    public static node insertAtEnd(node head , int val) {
        node newNode = new node(val);
        node temp =head;
        while(temp.next!=null){
            temp = temp.next;
        } 
        temp.next = newNode;

        return temp;
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


    public static node reverse(node head) {
         node prev = null;
         node curr = head;
         node agla = head.next;

         while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev =curr;
            curr = agla;
         }
         return prev;
    }

    public static void main(String[] args) {
        node ListNode = new node(6);
        insertAtEnd(ListNode, 7);
        insertAtEnd(ListNode, 8);
        insertAtEnd(ListNode, 9);
        insertAtEnd(ListNode, 10);
        insertAtEnd(ListNode, 11);
        insertAtEnd(ListNode, 12);
        node n2 =  reverse(ListNode);

        print(n2);
    }
   
}
