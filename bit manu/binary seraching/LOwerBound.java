
public class LOwerBound {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int arr[] = {0,1,2,3,4,5,5,7};
        int n =5;
       LowerBound(arr, n);
        
    }


    public static void LowerBound(int[]A ,int B) {
        int s = 0;
        int e  = A.length -1;
        int ans = -1;

        while(s<=e){
            int mid =  s+ (e-s)/2;
            if(A[mid]>=B){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }

        System.out.println(ans);

    }
    
}
