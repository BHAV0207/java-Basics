public class Student {
    String name;
    int age;
    int rollNo;
    String email;

    Student(String name, int age, int rollNo, String email) {
       this.name = name;
       this.age = age;
       this.rollNo = rollNo;
       this.email = email; 
    }

    void print() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("rollNo = " + rollNo);
        System.out.println("email = " + email);
    }
}
