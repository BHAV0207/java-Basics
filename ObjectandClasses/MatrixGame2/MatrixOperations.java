import java.util.Scanner;

public class MatrixOperations{
     int row;
     int col;
     int [][] Array;

     MatrixOperations(int row ,int col)
     {
        this.row =row;
        this.col =col;
        Array = new int[row][col];
     }


     void inputMatrix()
     {
        System.out.println("Please input the element of the Matrix");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;i<this.row ;i++)
        {
            for(int j =0 ;j<this.col ;j++)
            {
                Array[i][j] = sc.nextInt();
            }
        }
     }


    void PrintMatrix()
    {
        for(int i = 0 ;i<this.row ;i++)
        {
            for(int j =0 ;j<this.col ;j++)
            {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println("");   
        }
    }



    void MatrixTranspose()
    {
        System.out.println("Matrix is being transposed");
        for(int i = 0 ;i<this.row ;i++)
        {
            int temp = 0 ;
            for(int j = 0 ;j<=i ;j++)
            {
                temp = Array[i][j];
                Array[i][j] =Array[j][i];
                Array[j][i] =temp;
            }
        }
    }




    void MatrixRotationRight()
    {
        System.out.println("Matrix is being rotated");
        MatrixTranspose();
        for(int i =0 ;i<row ;i++)
        {
            int temp2 =0;
            for(int j =0 ;j<col/2 ;j++)
            {
                temp2 =Array[i][j];
                Array[i][j] = Array[i][col-1-j];
                Array[i][col-1-j] =temp2;
            }
        }
    }



    MatrixOperations AddMatrix(MatrixOperations AddValliMatrix)
    {
        System.out.println("Matrix is being added");
        MatrixOperations Addition = new MatrixOperations(row , col);
        for(int i = 0 ; i<row ;i++)
        {
            for(int j = 0 ; j<col ;j++)
            {
                Addition.Array[i][j] = Array[i][j] + AddValliMatrix.Array[i][j];
            }
        }
        return Addition;
    }



    MatrixOperations SubMatrix(MatrixOperations SubValliMatrix)
    {
        System.out.println("Matrix is being sbtracted");
        MatrixOperations Subtraction  = new MatrixOperations(row, col);
        for(int i =0 ; i<row ;i++)
        {
            for(int j =0 ;j<col; j++)
            {
                Subtraction.Array[i][j] =Array[i][j] - SubValliMatrix.Array[i][j];
            }
        }
        return Subtraction;
    }



    MatrixOperations MatrixMulti(MatrixOperations MultiValliMatrix)
    {
        System.out.println("Matrix is being multiplied");
        MatrixOperations Multiplication =  new MatrixOperations(this.row, MultiValliMatrix.col);
        for(int i = 0 ; i<this.row ;i++)
        {
            for(int j =0 ; j< MultiValliMatrix.col ; j++)
            {
                int sum =0;
                for(int k = 0 ; k< this.col ;k++)
                {
                    sum = sum + Array[i][k]*MultiValliMatrix.Array[k][j];
                }
                Multiplication.Array[i][j]  = sum;
            }
        }
        return Multiplication;

    }


    



    





}