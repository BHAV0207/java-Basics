import java.util.ArrayList;

public class MaxSubArraySum {

    public static int MaxSum(int BB[]) {
       // ArrayList<Integer> bhav = new ArrayList<>();
        int max = BB[0];
        for(int i =0 ;i<BB.length ;i++)
        {
            if(max<BB[i])
            {
                max =BB[i];
            }
        }
        return max;
    }


    public static int[] PrefixSum(int AA[]) {

        int sum =0 ;
        int Lappa[] = new int[AA.length];
        for(int i =0 ; i<AA.length ;i++)
        {
            sum =sum +AA[i];
            Lappa[i] = sum;
        }

        return Lappa;
        
    }
    public static void main(String[] args) {
        int Array[] = {1 , 2,3 ,4,-5,6,-7,-8};
        System.out.println(MaxSum(PrefixSum(Array)));
    }
}
