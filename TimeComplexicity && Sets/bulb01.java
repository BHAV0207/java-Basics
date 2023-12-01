import java.util.Scanner;

public class bulb01{

    public static void bulbOnnOff(int [] BB) {
        int count =0;
        for(int i =0 ;i<BB.length-1 ;i++)
        {
            if(BB[i]==1)
            {
                continue;
            }
            else if(BB[i+1]==1)
            {
                continue;
            }
            else
            {
                BB[i]=1;
                count++;
            }
           
        }
        System.out.print(count);
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int [] Bulb = new int[A];
        for(int i =0 ;i<A ;i++)
        {
            Bulb[i] =sc.nextInt();
        }
        bulbOnnOff(Bulb);
    }
}