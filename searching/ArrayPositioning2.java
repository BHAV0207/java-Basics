public class ArrayPositioning2 {
    public static void main(String[] args) {
        int [] arr = {9,8,1,6,5,11,4,7};
        int target = 7;
        System.out.println(rearrange(arr)); 
    }
   // static void swap()

    static int rearrange(int[] A){
        int lastEle = A[A.length-1];
        int j =0 ;

        for(int i =0 ;i<A.length-1 ;i++){
            if(A[i]<lastEle){
                swap(A , i ,j);
                j++;
            }
        }
    }
}
