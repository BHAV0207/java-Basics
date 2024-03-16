public class FactorsOfAStringOfNumbers {

    public static void Factors(int n) {
        int cnt= 0;
        for(int i =1 ;i*i<=n ;i++){
            if(n%i ==0){
                cnt++;
                if(i != n/i){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

// this time complexity is n_underoot_n;

    


    public static void OpttimisedFactors(int n) {
        for(int i =1 ;i<=n ;i++){
            int cnt =0;
            for(int j =i ;j<=n ;j+=i){
                cnt++;
            }
                System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0 ;i<Arr.length ;i++){
            OpttimisedFactors(Arr[i]);
        }
       // OpttimisedFactors(10);



    }
}
