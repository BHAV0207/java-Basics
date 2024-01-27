//when using binary search for a range of answers identify the range an give the lowes to the min and max to highest
public class AAAAANthRoot {
    public static void main(String[] args) {
        int A = 64;
        int B = 2;
        System.out.println(Nth_root(A, B));

    }

    public static int Multi(int N , int A) {
        int d =1;
        for(int i = 0; i<N ;i++){
            d = d*A;
        }
        return d;
    }
    public static int Nth_root(int A, int  B) {
        int start =1;
        int end = B;

        while(start<=end){
            int mid =  start+ (end-start)/2;
            if(Multi(A, mid)==B){
                return mid;
            }
            if(Multi(A, mid)<B){
                start = mid+1;
            }
            else{
                end  = mid-1;
            }

        }
        return -1;
    }
}
