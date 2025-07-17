package Bitwise_Operators;
//count set bits
public class Bitwise_7 {

    public static void main(String[] args) {

        int n= 10;

        System.out.println(Integer.toBinaryString(n));   //gives the binary number for the given integer value


        System.out.println(setbits(n));
    }
    static int setbits(int n){

        int count=0;
//        while(n>0){
//
//            count++;
//            n -= (n & (-n));
//
//
//        }

        while(n>0){

            if((n&1)==1){
                count++;
            }
            n=n>>1;


        }
        return count;
    }

}
