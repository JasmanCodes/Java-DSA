public class Reverse {

    public static void main(String[] args) {

        int n=26754;

        int ans=0;
        while(n>0){
           int rem= n % 10;
            ans= ans* 10 +  rem;

            n=n/10;




        }
        System.out.println(ans);

    }
}
