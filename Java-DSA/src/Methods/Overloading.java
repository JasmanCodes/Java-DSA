public class Overloading {
// same class
// same name
// different arguments  =method overloading
    public static void main(String[] args) {

        fun(5);
        fun("jas");

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
