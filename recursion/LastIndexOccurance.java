public class LastIndexOccurance {
    
    public static void main(String[] args) {
        int arr[] = {5,8,9,1,3,4,3};  
       System.out.println(lastindex(arr, 0 , 5)); 
    }

    public static int lastindex(int arr[], int index ,int target) {

        if(index == arr.length ){
            return -1;
        }
        int A = lastindex(arr, index+1, target);

        if(A == -1){
            if(arr[index] == target){
                return index;
            }
            else{
                return -1;
            }
        }
        else{
            return A;
        }
    }
}
