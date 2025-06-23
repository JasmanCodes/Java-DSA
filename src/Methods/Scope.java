public class Scope   {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

      //  System.out.println(marks);// here marks will not work as it is unknown in this method


        {
            //int a=30; //oi cant intialize a again adn again
            a=90; ////// i can change the value of a
        int c=90; // value initialized in the block will remain here

        }
       // System.out.println(c); //// cannot call c outside the block


        ///// Scoping in For loops

        for (int i =0; i<4;i++) {
            System.out.println(i);
            int num=90;
          ///  int a = 10;  // i cannot again intialize a but i can change its value
              a=10000;

        }
        System.out.println(a);


    }

    static void random(int marks) {

        int num=67;
        System.out.println(num);
        System.out.println(marks);
        //this change will only be valid in this function scope only
    }
}
