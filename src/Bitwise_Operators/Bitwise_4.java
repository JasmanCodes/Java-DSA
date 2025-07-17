package Bitwise_Operators;
//the number of digits in different bases
public class Bitwise_4 {

    public static void main(String[] args) {
        int n = 10;    //actual number
        int b = 2;    // base like binary or decimal

        int ans =(int)(Math.log(n)/Math.log(b)+1 );

        System.out.println(ans);
    }
}
