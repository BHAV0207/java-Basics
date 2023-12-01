import java.util.Scanner;

public class Matrix {
    
    int rows;
    int cols;
    int arr[][];

    Matrix(int rows, int cols) {
        //in constructor we define the actual usage or face of the object we created;
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];
    }

    // Matrix(int arr[][]) {
    //     this.arr = arr;
    //     rows = arr.length;
    //     cols = arr[0].length;   
    // }

    void input() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter matrix");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    void print() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose(){
        for(int i = 0 ; i<rows ;i++){
            int temp = 0 ;
            for(int j = 0 ; j<i ;j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    void rotate(){
        transpose();
        for(int i =0 ;i<rows ;i++){
            int temp = 0 ;
            for(int j =0 ;j<cols/2 ;j++){
                temp = arr[i][j];
                arr[i][j] = arr[i][cols - 1 -j];
                arr[i][cols -1- j ] = temp;
            }
        }


    }

    Matrix add(Matrix other) {
        System.out.println("Add machayenge");
        Matrix add = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                add.arr[i][j] = arr[i][j] + other.arr[i][j];
            }
        }
        return add;
    }

   

    Matrix subtract(Matrix other2){
        System.out.println("Subraction machayenge");
        Matrix Subtraction = new Matrix(rows ,cols);
        for(int i =0 ; i<rows ;i++){
            for(int j = 0 ; j<cols ; j++){
                Subtraction.arr[i][j] = arr[i][j] - other2.arr[i][j];
            }
        }
        return Subtraction;
    }

    Matrix multiplication(Matrix other3){
        System.out.println("Multi hoga yaha pey");
        Matrix Multi = new Matrix(this.rows, other3.cols);
        for (int i =0 ; i<rows ; i++){
            for(int j = 0 ; j<other3.cols ;j++){
                int sum =0;
                for(int k =0 ; k<cols ;k++){
                    sum = sum + arr[i][k]*other3.arr[k][j]; 
                }
                Multi.arr[i][j] = sum;
            }
        }
        return Multi;

    }
}
