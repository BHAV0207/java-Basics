/**
 * FrogJump
 */
public class FrogJump {
    //recursive
    public static int FrogJumpp(int A , int Energy[]) {
        if(A == 0){
            return 0;
        }

        int oneStep = FrogJumpp((A-1) , Energy) + Math.abs(Energy[A] - Energy[A-1]);
        int twoStep = Integer.MAX_VALUE;
        if(A>1){
            twoStep = FrogJumpp((A-2) , Energy) + Math.abs(Energy[A] - Energy[A-2]);
        }


        return Math.min(oneStep, twoStep);
    } 
     

    // memorised dp
    public static int FrogJumpMemo(int A , int Energy[] , int arr[])  {
        if(A == 0){
            return 0;
        }
        if(arr[A] != -1){
            return arr[A];
        }
        int oneStep = FrogJumpMemo(A-1, Energy, arr) + Math.abs(Energy[A] - Energy[A-1]);
        int twoStep = Integer.MAX_VALUE;
        if(A>1){
            twoStep = FrogJumpMemo(A-2 , Energy , arr) + Math.abs(Energy[A] - Energy[A-2]);
        }

        return  arr[A] = Math.min(oneStep, twoStep);
    }

    // tabulated

    // public static int FrogJumpTabu(int A , int Energy[] , int arr[])  {
    //     arr[0] = 0;
    //     for(int i = 1  ;i <A ;i++){
    //         int oneStep = arr[A-1] + Math.abs(Energy[A] - Energy[A-1]);
    //         int twoStep = Integer.MAX_VALUE;
    //         if(A>1){
    //             twoStep = arr[A-2] + Math.abs(Energy[A] - Energy[A-2]);
    //         }

    //         arr[A] = Math.min(oneStep, twoStep);
    //     }
       

    //     return  arr[A];
    // }

    public static void main(String[] args) {
        int A = 4;
        int Energy[] = {10, 20, 30,10,40};
        int arr[] = new int [A+1];
        for(int i =0 ;i<A+1; i++){
            arr[i] = -1;
        }

        System.out.println(FrogJumpMemo(A, Energy, arr) );
    }
}