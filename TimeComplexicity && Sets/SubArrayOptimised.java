 class SubArrayOptimised {

    /*CODE NOT WORKING CHECK HOME CLASS  */
    public static void main(String[] args) {
        int [] BB= {1,2,-2, 3,4,5,6,7,-5,-6,-6,-1};
        System.out.println(SumZeroOrNot(BB));
    }

    public static boolean SumZeroOrNot(int[] AA) {   
        boolean hello =false;
        for(int i =0 ; i<AA.length ; i++)
        {
            int sum =0 ;
            for(int j =i ;j<AA.length ;j++)
            {
                sum =sum + AA[j];
                if(sum!=0)
                {
                    return hello;
                }
            }
        }
        return true;
    }


}