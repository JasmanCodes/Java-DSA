package Bitwise_Operators;
//checking if the number is the power of 2 or not
public class Bitwise_5 {

    public static void main(String[] args) {
        int n=16;

        boolean ans = (n&(n-1)) ==0;
        System.out.println(ans);
    }
}
