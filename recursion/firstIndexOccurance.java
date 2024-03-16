public class firstIndexOccurance {
    public static void main(String[] args) {
        int arr[] = {5,8,9,1,3,4,5};  
       System.out.println(firstIndex(arr, 0 , 70)); 
    }

    public static int firstIndex(int Arr[] , int index , int target){
        if(index == Arr.length){
            return -1;
        }

        int A = firstIndex(Arr, index+1, target);

        if(Arr[index] == target){
            return index;
        }
        else{
            return A;
        }
    }
}
