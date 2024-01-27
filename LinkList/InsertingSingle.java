
class node{

    int val;
    node next;
    public node(int val)
    {
        this.val=val;
        this.next = null;
    }

    // //gets value at nth index
    // int get(int n)
    // {
    //     node v=this;
    //     for(int i=0;i<n;i++)
    //     {
    //         v=v.next;
    //     }
    //     return v.val;
    // }
}

public class InsertingSingle {
    //insets value at start 
    public static node insertAtStart(node head, int val)
    {
        node newHead = new node(val);
        newHead.next=head;
        head = newHead;
        return head;
    }

    //inserts at end
    public static node insertAtEnd(node head, int val)
    {
        node N = new node(val);
        node temp = head;
        if(head==null)
        {
            return head;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = N;
        return head;
   }

   public static node insertAtKthIndex(node head,int k,int val)
   {
       if(k==0)
       {
            return insertAtStart(head, val);
       }

       node temp = head;
       int count=1;
       while(count<k)
       {  
           temp=temp.next;
           count++;
        }
        node N = new node(val);
        N.next = temp.next;
        temp.next = N;
        return head;
   }

    public static void main(String args[])
    {
        node n1 = new node(5);
    //     n1.next = new node(6);
    //     n1.next.next = new node(7);
        node n = null;
        n1 = insertAtEnd(n1,6);
        n1 =insertAtStart(n1, 2);
        n1 =insertAtKthIndex(n1, 1, 10);
        System.out.println(n1.next.val);
    }
    
}