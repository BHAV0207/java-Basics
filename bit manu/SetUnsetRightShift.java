public class SetUnsetRightShift {
       public static void main(String [] args){
        int N = 21;
        int i = 2;
        System.out.println(SetOrNot(N, i));

    }

    public static int SetOrNot(int A ,int B){
         A = A>>B;
         int C = A&1;

         return C;
    }
}

 
