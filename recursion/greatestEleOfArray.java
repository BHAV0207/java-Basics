public class greatestEleOfArray {
    public static void main(String[] args) {
        int arr[] = {70,8,9,1,2,3,4,5};  
       System.out.println(max(arr, 0)); 
    }

    public static int max(int arr[] ,int index) {
        if(index == arr.length){
            return -1;
        }

        int A =  max(arr, index+1);
        if(arr[index]>A){
            return arr[index];
        }

        return A;
    }

}
