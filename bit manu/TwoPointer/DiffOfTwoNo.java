public class DiffOfTwoNo {
    public static void main(String[] args) {
        int A[] = {-4,1,2,3,4,5,6,7,8};
        int k=5;
        System.out.println(Hi(A, k));
       
    }

    public static boolean Hi(int A[] ,int K) {
        int i =1;
        int j =0;
        while(i<A.length-1){
            if(A[i]-A[j]==K){
                return true;
            } 
            
            else if(A[i]-A[j]>K){
                j++;
                if(i==j){
                    i++;
                }
            }
            else{
                i++;
            }
        }

        return false;
    }
}
