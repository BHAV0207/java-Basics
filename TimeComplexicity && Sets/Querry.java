import java.util.Scanner;

public class Querry{

    public static void QuerryReport(int [] BB , int CC)
    {
        Scanner sc = new Scanner(System.in);
        boolean QuerryNotPresent =false;
        for(int i = 0 ;i<CC ;i++)
        {
            System.out.println("enter your querry");
            int DD = sc.nextInt();
            for(int j =0 ; j<BB.length ;j++)
            {
                if(BB[j]==DD)
                {
                    System.out.println("Element is present");
                }
            }
            QuerryNotPresent = true;


        }
        if(QuerryNotPresent){
            System.out.println("Element is not present");
        }
        
    }





    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the size of array");
        int N = sc.nextInt();
        int[] ArrayLand = new int[N];

        System.out.println("Insert the elements of the array");
        for(int i = 0 ;i<N ;i++)
        {
            ArrayLand[i] =sc.nextInt();
        }

        System.out.println("Enter the numbers of query");
        int NoOfQuerry = sc.nextInt();

        QuerryReport(ArrayLand , NoOfQuerry);

        
    }
}
