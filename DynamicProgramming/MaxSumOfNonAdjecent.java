//find the nmaximum sum of non adjecent elements //


public class MaxSumOfNonAdjecent {
    // memoisation
    public static int NonAdjecent(int indx , int arr[] , int memo[]) {
        if(indx == 0){
            return arr[indx];
        }
        if( indx <0){
            return 0;
        }

        if(memo[indx] != -1){
            return memo[indx];
        }

        int pick = arr[indx] + NonAdjecent(indx-2, arr, memo);
        int notPick = 0 + NonAdjecent(indx-1, arr, memo);

        return memo[indx] = Math.max(pick, notPick);
         
        

    }
    public static void main(String[] args) {
        int Arr[] ={8,1,6,9,5};
        int memo[] ={-1,-1,-1,-1,-1,-1};
       System.out.println(NonAdjecent(4, Arr, memo));
    }
}
