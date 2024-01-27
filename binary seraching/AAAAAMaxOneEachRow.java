package twoD;

public class AAAAAMaxOneEachRow {
        public static void main(String[] args) {
            int A[][] = {{0,0,1,1,1},
                        {0,0,0,0,0},
                        {0,1,1,1,1},
                        {0,0,0,0,0},
                        {0,1,1,1,1}};
            System.out.println(Ones(A));
        }
    
        public static int LowerBound(int A[], int B) {
            int start = 0;
            int end  = A.length-1;
            int ans =-1;
    
            while(start<=end){
                int mid = start + (end-start)/2;
                if(A[mid]>=B){
                    ans = mid;
                    end = mid-1;
                } 
                else{
                    start = mid +1;
                }
            }
            return ans;
        }
    
        public static int Ones(int A[][] ,  ) {
            int count =0;
            int index =0;
            for(int i = 0 ;i<A.length ;i++){
                int countOnes =  A[i].length - LowerBound(A, 1);
                if(countOnes>count){
                    count  = countOnes;
                    index =i;
                }
            }
        }
    
    
}
