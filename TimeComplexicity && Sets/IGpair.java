import java.util.Scanner;

public class IGpair{

    static void IgPair(String AA)
    {
        //abcgag
      int CountG =0;
      int countPair =0;

      //index always goes till index zero so never take it i>0 and  takt it to i>=0

      for(int i = AA.length()-1 ; i>=0 ; i--)
        {
            if(AA.charAt(i)=='g')
            {
                CountG++;
            }
            if(AA.charAt(i)=='a')
            {
                countPair+=CountG;
            }
        }
      System.out.println(countPair);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your String Input here");
        String Input =  sc.nextLine();

        IgPair(Input);

    }
}