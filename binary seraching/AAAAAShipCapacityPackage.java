public class AAAAAShipCapacityPackage {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int B  =3;
        Max(A);
        Sum(A);
        System.out.println(BinarySearch(A, B)); 
    }

    public static int Max(int A[]) {
        int max  =  Integer.MIN_VALUE;
        for(int  i=0 ; i < A.length ;i++){
            if(max<A[i]){
                max  = A[i];
            }
        }
        return max;
    }

    public static int Sum(int A[]) {
        int sum =0;
        for(int  i=0 ; i < A.length ;i++){
          sum =sum + A[i];
        }
        return sum;
    }

    public static boolean DayCalc(int A[] , int B ,int K) {
        int sum=0;
        int count =1;
        for(int i = 0 ;i<A.length ;i++){
            if(sum + A[i] > B){
                count++;
                sum =A[i];
                
            }
            else{
                sum += A[i];
            }
        }

        return count<=K ;
       // return count;
    }

    public static int BinarySearch(int A[] , int B) {
        int start = Max(A);
        int end  = Sum(A);
        int ans =-1;

        while(start<=end){
            int mid  = start+ (end-start)/2;
          //  bo bhav =  

            if(DayCalc(A, mid ,B)){
                ans  =  mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }

        return ans;

    }

}
