import java.util.ArrayList;


// all houses are in circle and the robber cant steal form djecent houses...thus find the max sum of non adjecent elements//
public class houseRobber {
    public static int Robber(int indx , ArrayList<Integer> arr , int memo[]) {
        if(indx == 0){
            return arr.get(indx);
        }
        if(indx<0){
            return 0;
        }

        if(memo[indx] != -1){
            return memo[indx];
        }

        int pick =  arr.get(indx) + Robber(indx-2, arr, memo);
        int notPick = 0 + Robber(indx-1, arr, memo);


        return memo[indx] = Math.max(pick, notPick);

    }
    public static void main(String[] args) {
        int ARR[] = {1,3,2 ,1};
        int memo[] = {-1,-1,-1,-1};
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i =0 ;i<ARR.length ;i++){
            if(i != 0){
                A.add(ARR[i]); 
            }
            if(i!= ARR.length-1){
                B.add(ARR[i]);
            }
        }

        int ans1 = Robber(A.size()-1, A, memo);
        int ans2 = Robber(B.size()-1, B, memo);

        System.out.println(Math.max(ans1, ans2));
    }

}