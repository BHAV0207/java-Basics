public class Toogling {
    public static void main(String [] args){
        int a  = 10;
        int i =2;
        System.out.println(Toogle(a, i));

    }

    static int Toogle(int a ,int i){
        int c = 1<<i;
        int d =a^c;
        return d;

    }
}

    
