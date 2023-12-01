import java.util.*;
public class palendrome{
    public static int Palendrome(String A){
            for(int  i= 0 ; i<A.length() ; i++){
                for(int j = A.length()-1 ; i>=0 ;i--){
                    if(A.charAt(i)!=A.charAt(j)){
                            return 0;
                            break;
                    }
                }
                  //  if(A.charAt(i)==A.charAt(A.length()-1))
            }
            return 1;

    }



    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String CountOfVovel = sc.nextLine();
        
        Palendrome(CountOfVovel);
    }
}