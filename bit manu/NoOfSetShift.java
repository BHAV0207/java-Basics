public class NoOfSetShift {
    public static void main(String [] args){
        int N = 11;

        System.out.println( NoOfSet(N));
    }

    public static int NoOfSet(int A){
        int count  =0;
        if(A%2==1){
            count =1;
        }
            while(A>0){
                A = A>>1;
                if(A%2==1){
                    count++;
                }

        }
        
        return count;
    }
}
    
