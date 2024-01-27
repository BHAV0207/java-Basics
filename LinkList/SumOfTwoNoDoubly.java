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


public class SumOfTwoNoDoubly {

    public static node addition(node h1 , node h2) {
        node dummy = new node(-1);
        node curr = dummy;
        node t1 = h1;
        node t2 = h2;
        int carry = 0;
        
        while(t1!=null || t2!=null){
            int sum = carry;
            if(t1!=null) sum+= t1.val;
            if(t2!=null) sum+= t2.val;
            node NewNode = new node(sum%10);
            carry  = sum/10;

            curr.next =NewNode;
            curr =curr.next;

            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 =t2.next;
        }

        if(carry!=0){
            node bhav = new node(carry);
            curr.next = bhav;
        } 

        return dummy.next;
        

    }
    public static void main(String[] args) {
        
    }
}
