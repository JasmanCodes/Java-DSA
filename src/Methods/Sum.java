import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

     //   int ans= sum2();
     //   System.out.println(ans);// call it as many times u want

        int ans = sum3(23,45);
        System.out.println(ans);
    }

        /*syntax

        access_modifier  return_type name () {
                 //body
                 RETURN STATEMENT}*/

    //passing the values of numbers when u r calling the numbers

    static int sum3(int a ,int b) {

        int Add =a+b;

        return Add;
    }













    //Return the valure

    static int sum2(){


        Scanner in= new Scanner(System.in);

       System.out.print("enter first number:");
    int num1=in.nextInt();
       System.out.println("enter second number: ");
    int num2= in.nextInt();

    int Add =num1+num2;

       return Add;}


   static void sum() {

    Scanner in= new Scanner(System.in);

            System.out.print("enter first number:");
    int num1=in.nextInt();
            System.out.println("enter second number: ");
    int num2= in.nextInt();

    int Add =num1+num2;

            System.out.println(Add);



    //Return the valure








   }



}
