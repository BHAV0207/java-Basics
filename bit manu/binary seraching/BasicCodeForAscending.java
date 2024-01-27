public class BasicCodeForAscending{

    public static void main(String [] args){
        // BINARY SEARCH IS ALWAYS USED FOR SORTED ARRAYS

        int []bhav = {1 ,2,3,4,56,70,90,100,200,900};
        int BB = 100;
        System.out.println(BinarySearch(bhav, BB));
    }


    static int BinarySearch(int[]AA ,int target) {
        int start =0;
        int end = AA.length-1;

        while(start<=end){
            int mid  = start + (end-start)/2;

            if(target<AA[mid]){
                end = mid-1;
            }
            else if (target>AA[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1; 
    }
}

