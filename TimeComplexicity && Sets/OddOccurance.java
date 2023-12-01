import java.util.*;

public class OddOccurance {

    public static void PrintOddFreq( int []BB){
        HashSet<Integer> ans = new HashSet<Integer>();
        
        for(int i =0 ;i<BB.length ;i++)
        {
            int count = 0;
            for(int j =0 ;j<BB.length ; j++ )
            {
                if(BB[i]==BB[j])
                {
                    count++;
                }
            }
            if(count%2!=0)
            {
                ans.add(BB[i]);
            }
        }
        for(int i : ans ){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] AA = new int [N];

        for(int i = 0 ;i<N ;i++){
            AA[i]= sc.nextInt();
        }

        PrintOddFreq(AA);
    }
}
