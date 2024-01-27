import java.util.ArrayList;

class node{
    int val;
    node next;

    node(int val){
        this.val = val;
        this.next = null;
    }
}
public class OddEvenSingly {
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
        while(temp.next!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val + " ");
        System.out.println();
    }

    public static node OddEven(node head) {

        if(head  == null || head.next == null){
            return head;
        }
        node odd = head;
        node even = head.next;
        node check = head.next;
        
        while(even!=null && even.next!=null){
           odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        } 

        odd.next = check;

        return head;
    }


    public static void main(String[] args) {
        node bhav = new node(1);
        insertAtEnd(bhav, 2);
        insertAtEnd(bhav, 3);
        insertAtEnd(bhav,4);
        insertAtEnd(bhav,5);
        insertAtEnd(bhav, 6);
        node n2 = OddEven(bhav);
       print(n2);

    

    }
    
}
