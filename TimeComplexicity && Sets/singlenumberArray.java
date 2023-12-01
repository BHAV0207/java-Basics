import java.util.* ;

public class singlenumberArray{

    public int[] DistinctElement(int [] AA ){
        ArrayList<Integer> bhav = new ArrayList<Integer>();
        for(int i = 0  ; i<AA.length ;i++){
            boolean found = false;
            for(int j = 0 ; j<i ;j++){
                if( AA[i]==AA[j]){
                    found = true;
                    break;
                }
            }

        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();

        int[] ArrayLand = new int[ArraySize];

        for(int i = 0 ;i<ArraySize ;i++){
            ArrayLand[i] = sc.nextInt();
        }
        
        DistinctElement(ArrayLand);

    }
}