package Recursion;


//using the actual fibo formula
public class Fibo {

    public static void main(String[] args) {

        System.out.println(fiboformula(50));

    }

    static long fiboformula(int n){

        return (long)(Math.pow(((1+Math.sqrt(5))/2),n)/ Math.sqrt(5));
    }
}
