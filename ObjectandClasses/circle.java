class CircleAtt{
    int radius;
    String color;


    CircleAtt(int radius ,String color){
        this.radius =radius;
        this.color = color; 
    }


    void CircleInfo(){
        System.out.println("this is the info on circle");
        System.out.println(color);
        System.out.println(2*3.14*radius);
        System.out.println(3.14*radius*radius);
    }   


    boolean Comparision(CircleAtt c1){
        if(c1.radius == this.radius)
            return true;
         return false;
    }

    // void CircleColor(){
    //     System.out.println(color);
    // }

    // void getCircumfrence(){
    //     System.out.println(2*3.14*radius);
    // }

    // void GetArea(){
    //      System.out.println(3.14*radius*radius);
    // }
}



public class circle{
    public static void main(String [] args){
       CircleAtt c1 = new CircleAtt(40 ,"Green");
       CircleAtt c2 = new CircleAtt(40, "blue");
        System.out.println(c1.equals(c2));
        c1.CircleInfo();
        c2.CircleInfo();
    } 
}