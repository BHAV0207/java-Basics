public class AAAAAKFrogJumps {

    //memorised 
    public static int KJumps(int A ,int k,int [] Energy , int Arr[]) {
        if(A ==0){
            return 0;
        }

        if(Arr[A] != -1){
            return Arr[A];
        }
     //   int jump = KJumps(A-1,k , Energy, Arr) + Math.abs(Energy[A] - Energy[A-1]);
        int right = Integer.MAX_VALUE;
        for(int i =1 ; i<=k ;i++ ){
            if(A>i){
               int jump = KJumps(A-i, k, Energy, Arr) + Math.abs(Energy[A] - Energy[A-i]);
               right = Math.min(right, jump);
            }
        }  
        return Arr[A] = right;
    }
    public static void main(String[] args) {
        
    }
}
