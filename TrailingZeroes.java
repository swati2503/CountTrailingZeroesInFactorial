public class TrailingZeroes {
    public static void main(String[] args) {
        int num=251;
        //Iterative Method
        int res=0;
        for(int i=5;i<=num;i*=5){
            res+=num/i;
        }
        System.out.println(res);

        }
    
}
