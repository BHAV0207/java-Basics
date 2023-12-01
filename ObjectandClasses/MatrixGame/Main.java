public class Main {
    
    
    public static void main(String [] args){
        
        Matrix m1 = new Matrix(2, 3); // 1st const
        m1.input();
        
        //m1.rotate();
       // m1.transpose();
        //m1.print();
        
        Matrix m2 = new Matrix(3, 2);
        m2.input();
        
        // Matrix m3 = m1.add(m2);
        // m3.print();
        
        // Matrix m4 = m1.subtract(m2);
        // m4.print();
        
        Matrix m5 = m1.multiplication(m2); 
        m5.print();

        // Student s = new Student("Bhavya", 19, 69, "bhavya.jain@ms.sst.com");
        // s.print();


    }
}

// data type -> int, float, boolean, double, String, ...
// class -> user defined data type

