public class EvenDigitElement {
    static int EvenDigit(int[] AA) {

        int ans =0;
        
        for(int i =0 ; i <AA.length ;i++){
            int count = 0;
            int d = AA[i];
            while(d>0){
                d = d/10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {

        int bhav [] = {1, 12 ,123 ,1234 , 12345 ,123456};

        System.out.println(EvenDigit(bhav));

    }
}
