
/**
 * AAAAANinjaTraining
 */
public class AAAAANinjaTraining {
//it is mentioned in the question that the array is N cross 3 it it is N days and three tasks...out of which one can be done in one day 
    public static int Training(int day , int Previous , int[][] ans) {
        if(day ==0 ){
            int maxi =0;
            for(int i =0 ;i<3 ;i++){
                if(i != Previous){
                    maxi = Math.max(maxi, ans[day][i]);
                }
            }
            return maxi;
        }

        int maxi2 =0;
        for(int task =0 ;task < 3 ;task++){
            if(task != Previous){
                int points = ans[day][task] + Training(day-1, task, ans);
                maxi2 = Math.max(maxi2, points);  
            }
        }
        return maxi2;
    }
    public static void main(String[] args) {
        
    }
}