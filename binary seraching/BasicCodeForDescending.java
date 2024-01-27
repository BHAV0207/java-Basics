public class BasicCodeForDescending{

    public static void main(String [] args){
        // BINARY SEARCH IS ALWAYS USED FOR SORTED ARRAYS

        int []bhav = {900 ,200,100 ,90 ,70, 56,4,3,2,1};
        int BB = 100;
        System.out.println(BinarySearch(bhav, BB));
    }


    static int BinarySearch(int[]AA ,int target) {
        int start =0;
        int end = AA.length-1;

        while(start<=end){
            int mid  = start + (end-start)/2;
//ONLY CHANGE IN CODE IS IN IF CONDITIONS 
            if(target<AA[mid]){
                
                start = mid +1;
            }
            else if (target>AA[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1; 
    }
}

