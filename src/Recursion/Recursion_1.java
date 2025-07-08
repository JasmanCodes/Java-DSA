package Recursion;

//printing numbers 1 to 5 using recursion

public class Recursion_1 {

    public static void main(String[] args) {

        print(1);

    }

    static void print(int n){
//base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        /// base condition ends

        System.out.println(n);
//recusive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        print(n+1);
    }
}
