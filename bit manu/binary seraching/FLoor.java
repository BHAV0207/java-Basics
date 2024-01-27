public class FLoor {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int arr[] = {0,1,2,3,4,5,5,6,7};
        int n =10;
        FLOOR(arr, n);
    }

    public static void FLOOR(int[]A ,int B) {
        int start = 0;
        int end  = A.length;
        int ans =-1;

        while(start<=end){
            int  mid =  start + (end - start)/2;
            if(A[mid]<=B){
                ans = A[mid];
                start = mid+1; 
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(ans);
    }

}
