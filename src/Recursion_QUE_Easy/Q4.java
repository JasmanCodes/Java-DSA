package Recursion_QUE_Easy;
//sum of digits of a number
public class Q4 {

    public static void main(String[] args) {

        int ans = prod(550);
        System.out.println(ans);

    }

    static int digits(int n){

        if(n==0){
            return 0;
        }

        return (n%10) + digits(n/10);
    }
//product of digits
    static int prod(int n){

        if(n%10==n){
            return n;
        }

        return (n%10) * digits(n/10);
    }
}
