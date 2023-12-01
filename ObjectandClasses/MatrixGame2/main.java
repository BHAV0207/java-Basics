public class main{
    public static void main(String [] args){
        MatrixOperations M1 = new MatrixOperations(3, 2);
        M1.inputMatrix();
        
        MatrixOperations M2 = new MatrixOperations(2, 3);
        M2.inputMatrix();

        MatrixOperations M3 = M1.MatrixMulti(M2);
        M3.PrintMatrix();
       // MatrixOperations M4 = M1.SubMatrix(M2);
       // M4.PrintMatrix();

    }
}