public class Swap {

    public static void main(String[] args) {
        int a= 20;
        int b= 10;


        swap(a,b);// this will not swap the value because it is pass by refernce and in primitive data types we can only pass by vale

        System.out.println(a + "    " + b);
        // swap two numbers

//
//        int temp= a;
//        a=b;
//        b=temp;



    }

    static void swap(int a, int b) {

        int temp=a;
        a=b;
        b= temp;
    }


}
