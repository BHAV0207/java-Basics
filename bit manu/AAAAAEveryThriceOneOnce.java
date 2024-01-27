public class AAAAAEveryThriceOneOnce {
    public static void main(String[] args) {
        int A[] = {1,1,1,2,2,2,3,3,3,4,5,5,5};
        System.out.println(Hi(A));
        
    }

    public static int Hi(int A[]) {
        int count =0;
        int OneBit =0;
        int ans  =0;

        for(int i =0 ; i<32 ;i++){
            OneBit = 1<<i;
            count =0;
            for(int j =0 ;j<A.length ;j++){
                    if((A[j]&OneBit)>0){
                        count++;
                    }
            }
            if(count%3!=0){
                ans = ans|OneBit;
            }
        }
        return ans;
    }

}
