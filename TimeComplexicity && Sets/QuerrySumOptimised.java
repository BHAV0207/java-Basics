import java.util.ArrayList;

public class QuerrySumOptimised {

    public static void main(String[] args) {

        int ArrayElement [] = {2 , 3 , 4 , 5, 6, 7, 8 , 8 , 9 , 0};
        
        int[][] Querries = {{1, 5} , { 3,4 } , {5,5} , {4,6}};   
        ArrayList<Integer> ans = Query(Querries,ArrayElement);
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }


    public static int[] Prefix(int[]PrefixSum) {
        int sum =0 ;
        int SUM[] =new int[PrefixSum.length+1];
        SUM[0] = 0;
        for(int i =0 ;i<PrefixSum.length ;i++)
        {
            sum = sum + PrefixSum[i];
            SUM[i+1] =sum;
        }
        return SUM;
    }


    public static ArrayList<Integer> Query(int [][] QuerryTaker , int[] A) {
        int[] Psum  = Prefix(A); 
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i<QuerryTaker.length ; i++)
        {
            int start = QuerryTaker[i][0];
            int end = QuerryTaker[i][1];
            ans.add(Psum[end+1]-Psum[start]);
        }
        return ans;

    }




}
