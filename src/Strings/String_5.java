package Strings;

import java.util.*;
//operators
public class String_5 {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); //both will be converted into its integer value and adding that
        System.out.println("a" + "b");

        System.out.println((char)('a'+ 3));

        System.out.println("a"+1);// integer will be converted to a Integer that will call a toString();

        System.out.println("kunal"+ new ArrayList<>());
   //     System.out.println("kunal"+ new Integer(56));




      //  System.out.println(new Integer(56)+ new ArrayList<>());  // this will not work but there is a alyternate

        String ans= new Integer(56) +""+ new ArrayList<>();
        System.out.println(ans);
    }

}
