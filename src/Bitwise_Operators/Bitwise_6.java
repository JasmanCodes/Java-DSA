package Bitwise_Operators;

//calculating a raise to the power b

public class Bitwise_6 {

    public static void main(String[] args) {

        int base=2;
        int power= 8;

        int ans=1;

        while(power>0){
            if((power&1)==1){
                ans*=base;
            }

            base*=base;
            power= power>>1;
        }
        System.out.println(ans);

    }
}
