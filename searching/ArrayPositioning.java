import java.util.ArrayList;

public class  ArrayPositioning{
    public static void main(String [] args){
        int [] arr = {9,8,1,6,5,11,4,7};
        int target = 7;
        System.out.println(ArrPosition(arr, target)); 

    }


    public static ArrayList<Integer> ArrPosition(int[] ans , int B ){
        ArrayList<Integer>  newAns = new ArrayList<>();
        for(int i = 0 ;i<ans.length ;i++){
            if(ans[i]<B){
                newAns.add(ans[i]);
            }
        }
        for(int i=0 ;i<ans.length ;i++){
            if(ans[i]==B){
                newAns.add(ans[i]);
            }
        }
        for(int i=0 ;i<ans.length ;i++){
            if(ans[i]>B){
                newAns.add(ans[i]);
            }
        }
    
        return newAns;
}
}