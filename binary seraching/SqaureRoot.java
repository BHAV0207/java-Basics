public class SqaureRoot {
    public static void main(String[] args) {
        int B  =  54; 
       System.out.println( Square(B));
    }

    public static int Square(int B) {
        int start =1;
        int end = B;
        int ans =  1;

        while(start<=end){
            
            int mid = start + (end-start)/2;
            if((mid*mid)<=B){
                ans =  mid;
                start = mid+1;
            }
            else{
                end  = mid-1;
            }

        }
        return ans;



    }
}
