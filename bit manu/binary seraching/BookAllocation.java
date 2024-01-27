public class BookAllocation {
    public static void main(String[] args) {
        int A[] = { 25,46,28,49,24};
        int NoStudents = 4;
        Max(A);
        sum(A);
        System.out.println(Binary(A, NoStudents));
    }

    public static int Max(int A[]) {
        int max  = Integer.MIN_VALUE;
        for(int i =0 ;i<A.length;i++){
            if(A[i]>max){
                max  = A[i];
            }
        }
        return max;
    }

    public static int sum(int A []) {
        int sum =0 ;
        for(int  i=0 ;i<A.length ;i++){
            sum= sum + A[i];
        }
        return sum;
    }

    public static boolean BookCount(int A[] , int mid  ,int NoStudents) {
        int count = 1;
        int sum =0;
        for(int i =0 ;i<A.length ;i++){
            if((sum+A[i])>mid){
                count++;
                sum = A[i]; 
            }
            else{
                sum  = sum +A[i];
            }
        }
        if(count>=NoStudents){
            return true;
        }
        else{
            return false;
        }

    }

    public static int Binary(int A[] , int NoStudents) {
        int start = Max(A);
        int end  = sum(A);
        int ans =-1;

        while(start<=end){
            int mid =  start + (end-start)/2;
            if(BookCount(A, mid, NoStudents)==true){
                ans = mid;
                start  = mid+1;
            }
            else{
                end =  mid-1;
            }

        }
        return start;
    }
}
