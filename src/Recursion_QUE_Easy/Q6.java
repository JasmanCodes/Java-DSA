package Recursion_QUE_Easy;
//palindrome
public class Q6 {

    public static void main(String[] args) {

        System.out.println(palin(121));

    }

    static int rev(int n){
        ///  another method  // some times you may need some additional variables in the argument
        /// int hat case,make another function

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);

    }

    static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);

    }
    static boolean palin(int n){
        return n==rev(n);
    }

}
