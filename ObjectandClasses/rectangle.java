class rectAtt{
    int Length;
    int Breadth;


    rectAtt(int Length , int Breadth){
        this.Length = Length;
        this.Breadth = Breadth;
    }


    void GetArea(){
        System.out.println(Length*Breadth);
    }
    

    void GetPeremeter(){
        System.out.println(2*(Length*Breadth));
    }


    boolean compare(rectAtt r1){
        if(r1.Length == this.Length && r1.Breadth == this.Breadth)
             return true;
         return false;
    }
}


public class rectangle{
    public static void main(String [] args){
        rectAtt r1 = new rectAtt(10, 30);
        rectAtt r2 = new rectAtt(10, 30);
        System.out.println(r1.equals(r2));
    
    }
}