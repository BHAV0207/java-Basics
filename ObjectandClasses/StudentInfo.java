class Student{
    String name;
    String email;
    String PhoneNo;
    String HomeTownPincode;
    String MentorEmail;
    int Scholarship;
    Double cgr;
    Double AnnualFees = 500000.00;


    Student(String name , String email , String PhoneNo , String HomeTownPincode){
        this.name = name; 
        this.email = email;
        this.PhoneNo = PhoneNo;
        this.HomeTownPincode = HomeTownPincode;
        // this.MentorEmail = MentorEmail;
        // this.Scholarship = Scholarship;
        // this.cgr = cgr;

    }

    void StudentProfile(){
        System.out.println("This shit is the classified info on the student");
        System.out.println(name);
        System.out.println(email);
        System.out.println(PhoneNo);
    }

    boolean SameGangland(Student GangLand){
        return this.HomeTownPincode == GangLand.HomeTownPincode;
    }

    Double DeductedFees(){
        return AnnualFees - AnnualFees*(Scholarship/100);
    }

}

public class StudentInfo{
    public static void main(String [] args){
        
    }
}