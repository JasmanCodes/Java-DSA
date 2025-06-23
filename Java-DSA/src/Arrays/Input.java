import java.util.Scanner;
import java.util.Arrays;

public class Input {



    public static void main(String[] args) {
Scanner in= new Scanner(System.in);


// array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 27;
        arr[2] = 26;
        arr[3] = 29;
        arr[4] = 34;
//[23,27,26,29,34]
      ///////  System.out.println(arr[3]);


      //  input using a for loop

//        for (int i =0; i<arr.length; i++ ) {
//            arr[i]= in.nextInt();
//        }
//        //we can also use this for printing it converts the array into string and print thart string
//
//        System.out.println(Arrays.toString(arr));

        //printing out
//        for (int i =0; i<arr.length; i++ ) {
//            System.out.println(arr[i] + " ");
//        }




        /// /array of objects
        String[] str= new String[4];
        for (int i=0; i< str.length; i++)  {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "jasman";
        System.out.println(Arrays.toString(str));
    }
}
