public class AAAAAStarngeEquality {
    public static void main(String[] args) {
        int A  =5;
        System.out.println(Equality(A));
        
    }

    public static int Equality(int A) {
        int  p=0;
        for(int i =31 ; i>=0 ;i-- ){
            int d = (A>>i)&1;
            if(d==1){
                p = i;
                break;
            }
        }

        int X =A;
        for(int i = p ; i>=0 ; i--){
             X = X^(1<<i);
        }

        int Y =A;
        Y = Y>>(p);
        Y = Y<<(p+1);

        return X+Y;
    }
}

