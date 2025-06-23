import java.util.Scanner;

public class Questions {
/// Q prime check
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
      //  int n = in.nextInt();

//        boolean ans= isprime(n);
//        System.out.println(ans);

     for (int i=100; i<1000;i++){
         if (isarmstrong(i)) {
             System.out.println(i + "   ");
         }
     }

    }

    // print all 3 digit armstrong numbers

    static boolean isarmstrong( int n){
        int original=n;
        int sum=0;

        while(n>0){
            int rem = n % 10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if (sum==original){
            return true;
        }
        else
            return false;
    }


    static boolean isprime(int n) {
        if (n <= 1) {
            return false;


        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;

            }
            c++;
        }
        if (c*c >n)  {
            return true;
        }
        return false;

    }
}
