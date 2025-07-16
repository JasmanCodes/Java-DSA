package Bitwise_Operators;
//odd or even
public class Bitwise_1 {

    public static void main(String[] args) {
        int n=68;

        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){

        return (n & 1) ==1;
    }
}
