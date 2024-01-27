public class KthMissingPosition {
    public static void main(String[] args) {
        int A[] = {2,3,4,7,9};
        int K = 4;
        System.out.println(Binary(A, K));
    }

    public static int Binary(int A[] , int B) {
        int start = 0;
        int end  =A.length-1;

        while(start<=end){
            int mid  = start + (end -start)/2;

            if((A[mid]-(mid+1))<=B){
                start =  mid +1;
            }
            else{
                end = mid -1;
            }
        }
        int d =  start+B;
        //we can also do d= (end + B + 1) check this by dry run;
        return d;
    }
}
