public class MinEleOfArray {
    public static void main(String[] args) {
        int ans[] ={7,8,9,1,2,3,4,5};
        MinEle(ans);
       //  System.out.println(MinEle(ans));
    }

    public static void MinEle(int []A) {
        int start =0;
        int end = A.length-1;
        int ansss = Integer.MAX_VALUE;

        while(start<=end) {
            int mid = start + (end-start)/2;
            
            if(A[start]<=A[mid]){
                ansss = Math.min(ansss, A[start]);
                start = mid+1;

            }
            else{
                ansss = Math.min(ansss , A[mid]);
                end = mid-1;
            }
        }
        System.out.println(ansss);
    }
}
