import java.util.Scanner;

public class leaderElement2 {
    public static void LeaderEle(int [] BB)
    {
        int max = BB[0];
        int count = 0;
        for(int i =0; i<BB.length;i++)
        {
            if(max<BB[i])
            {
                max =BB[i];
                count++;
            }
        }
        System.out.println(count);
        
    }




     public static void main(String [] args)
     {
        Scanner sc = new Scanner(System.in);
        int AA =sc.nextInt();
        int A[] =new int[AA];
        for(int i =0 ;i<AA ;i++)
        {
            A[i] =sc.nextInt();
        }
        LeaderEle(A);
    }
}
