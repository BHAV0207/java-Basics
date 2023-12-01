import java.util.*;


class user{
    private String PhoneNo;
    private String Email;
    private int PinCode;
    private String name;

    user( String name, String Email , String PhoneNo , int PinCode){
        this.name = name;
        this.Email = Email;
        this.PhoneNo = PhoneNo;
        this.PinCode = PinCode; 
    }

    void PrintProfile(){
        System.out.println(this.name);
        System.out.println(this.Email);
        System.out.println(this.PhoneNo);
        System.out.println(this.PinCode);
    }
    
    boolean SameGangLand(user k){
        return k.PinCode == this.PinCode;
    }

    String getname(){
        return this.name;
    }

    String getEmail(){
        return this.Email;
    }

    String getPhoneNo(){
        return this.PhoneNo;
    }


} 

class Student extends user{
   private int fees;
   private double CGR;
   private String MentorEmail;
   private int Scholarship;

    public Student(String name, String Email , String PhoneNo , int PinCode){
        super(name ,Email , PhoneNo, PinCode);
    }

    int CalculateFees(){
        int fees = 500000;
        int FeesDeduction = (int)(fees*(this.Scholarship)/(100));
        return fees - FeesDeduction;
    }

    void setMentorEmail(String email){
        this.MentorEmail = email;
    }

    void setCGR(double cgr){
        if(cgr>=0 && cgr<=10){
            this.CGR = cgr;
        }
        else{
            System.out.println("bokachodi na karo humse");
            System.out.println("Please enter your cgr again !");
            Scanner sc = new Scanner(System.in);
            double newCgr = sc.nextFloat();
            setCGR(newCgr);

        }
    }

    void setScholarship(int Scholar){
        if(Scholar>=0 && Scholar<=50){
            this.Scholarship = Scholar;
           // System.out.println(this.Scholarship);

        }
        else{
            System.out.println("Tera bapp chor gaya tha ki tere Maa");
        }
    }

    String getMentorEmail(){
        return this.MentorEmail;
    }

    double getCGR(){
        return this.CGR;
    }

    int getScholarship(){
        return this.Scholarship;
    }

    

}


public class JackThePapa{
    public static void main(String [] args){
        Student s1  = new Student("bhavya" , "bhvaya@123sexy.com", "7877712777" ,302021);
        //s1.PrintProfile();
        s1.setCGR(1.9);
        s1.setScholarship(50);

        System.out.println(s1.getname()); 
        System.out.println(s1.getCGR());
        System.out.println(s1.CalculateFees());
        
    }
}