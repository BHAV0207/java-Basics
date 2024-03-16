import java.util.PriorityQueue;

public class PriorityQKLargest {
    public static int Klargest(int Arr[] , int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i = 0  ;i<k ;i++){
            ans.add(Arr[i]);
        }

        for(int i = k ;i<Arr.length; i++){
            int curr = ans.peek();
            if(Arr[i]>curr){
                ans.remove(curr);
                ans.add(Arr[i]);
            }
        }

        return ans.peek();

    }
    public static void main(String[] args) {
        int ans[] = {1,23,45,21,66,55,3};
        System.out.println(Klargest(ans, 3));

    }
}
