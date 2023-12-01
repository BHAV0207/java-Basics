class student{
    String name;
    String email;
    String address; 
    int age;
    int RollNo;

   
    student(String name , String email , String address , int age , int RollNo){

        System.out.println("my info is being leaked....HELP!!!!");
        this.name = name;
        this.email = email;
        this.address = address;
        this.age =age;
        this.RollNo = RollNo; 
    }
    
    
    void printInfo(){
         System.out.println(name);
         System.out.println(email);
         System.out.println(address);
         System.out.println(age);
         System.out.print(RollNo);
    }


}

public class objects{
  public static void main(String[] args){

      student s1 = new student("Kohan" , "kohan123tikA" , "agartala" , 18 ,88);
      s1.printInfo(); 
      
    

  }
}