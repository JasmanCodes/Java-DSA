package Recursion_QUE_Easy;
//factorial of a number
public class Q2 {

    public static void main(String[] args) {
int ans = factorial(5);
        System.out.println(ans);
    }

    static int factorial(int n){
     if(n<=1){
         return 1;

     }

     return n*factorial(n-1);

    }

}
