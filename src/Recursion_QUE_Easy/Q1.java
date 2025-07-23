package Recursion_QUE_Easy;
///printing n to 1
public class Q1 {

    public static void main(String[] args) {

        fun(5);


    }

    static void display(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        display(n-1);


    }
//printing 1 to n
    static void displayrev(int n){
        if(n==0){
            return;
        }

        displayrev(n-1);
        System.out.println(n);


    }

    //printing 1 to n and n to 1
    static void displayboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        displayrev(n-1);
        System.out.println(n);


    }
    //concept
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       // fun(n--);///this will give stack overflow error
        fun(--n);




    }
}
