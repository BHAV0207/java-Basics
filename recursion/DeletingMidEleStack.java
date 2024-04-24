import java.util.Scanner;
import java.util.Stack;

public class DeletingMidEleStack {
    public static Stack<Integer> Del(Stack<Integer> st){
        int k = st.size()/2 +1;
        
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0 ;i<N ;i++){
            int A = sc.nextInt();
            st.push(A);
        }
    }
}
