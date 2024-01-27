
public class Searching2D {
    public static void main(String[] args) {
        int A [][]={{3,4,7,9},
                    {12,13,16,18},
                    {20,21,23,29}};
        int B = 21;
        System.out.println(Hey(A, B));
    }

    public static int Hey(int A[][] , int B) {
        int start = 0;
        int end = (3*4)-1;  //rows*col-1;

        while(start<=end){
            int mid =  start + (end-start)/2;
            int row = mid/4; //row(index) =  mid/rowSize;
            int col = mid%4; //col(index) = mid%colSize;
            // if(A[row][col]==B){
            //     return B;
            // }
            else if(A[row][col]>=B){
                end  = mid +1;
            }
            else{
                start =  mid-1;
            }
        }
        return -1;
    }
}

