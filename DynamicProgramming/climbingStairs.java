public class climbingStairs {

    //shortcut for recursion
    
    // 1) try to represent the problem in terms of index 
    // 2)Do all possible stuff on that index acc. to the problem statement 
    // 3) sum all stuff if count of all ways is asked 
    //     min of all stuff then do min etc.



    //recursion relation
    public static int Stairs(int A) {
        //step 1
        if(A == 0){
            return 1; 
        }
        if(A == 1){
            return 1;
        }
        // step 2
        int oneStep = Stairs(A-1);
        int twoStep = Stairs(A-2);
        //step 3
        // according to the question we wanted all possible ways thus we addded 
        return oneStep + twoStep;
         
    }

    // memoristaion
    public static int StairsMemo(int A , int Arr[]) {
        if(A == 0){
            return 1; 
        }
        if(A == 1){
            return 1;
        }

        if(Arr[A] != -1){
            return Arr[A];
        }

        int oneStep = StairsMemo(A-1 , Arr);
        int twoStep = StairsMemo(A-2 , Arr);


        return Arr[A] = oneStep + twoStep;
         
    }
    public static void main(String[] args) {
        int A = 4;
        int arr[] = new int[11];
        for(int i =0 ;i<11 ;i++){
            arr[i] =-1;
        }

        System.out.println(StairsMemo(A, arr));

    }
}
