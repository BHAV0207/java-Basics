import java.util.HashMap;

public class HashMapBasic{

    public static void HashBasic(int [] B)
    {
        HashMap<Integer ,Integer> bhav = new HashMap<Integer ,Integer>();
        for(int i =0 ;i<B.length ;i++)
        {
            if(bhav.containsKey(B[i]))
            {
                int freq =bhav.get(B[i]);
                bhav.put(B[i], freq +1);
            }
            else{
                bhav.put(B[i], 1);
            }
        }
    }
    public static void main(String [] args)
    {
        int [] A = {1 ,2,3,4,5,6,1,2,3,7,8,9};
        HashBasic(A);

    }
}