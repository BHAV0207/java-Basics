class node{
    int val;
    node next;
    node back;

    node(int val ,node next , node back){
        this.val = val;
        this.next = next;
        this.back = back;

    }

    node(int val){
        this.val = val;
        this.next = null;
        this.back = null;
    }
}

public class ArrayIntoLlDoubly {
     public static void print(node head) {
        while(head != null){
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
     }

     public static node ArrIntoLLDoubly(int[] arr) {
        node head = new node(arr[0]);
        node prev = head;
        for(int i = 1; i<arr.length ;i++){
            node temp = new node(arr[i],null ,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
     }


     public static void main(String[] args) {
        int arr[] = {12,5,6,8};
        node head = ArrIntoLLDoubly(arr);
        System.out.println(head);
     }
}
