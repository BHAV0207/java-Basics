public class DisplayArrayReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};  
        reverse(arr, 0);
    }

    public static void reverse(int arr[] ,int index) {
        if(index == arr.length){
            return;
        }
        reverse(arr, index+1);
        System.out.println(arr[index]);
    }
} 
