package Strings;

import java.util.Arrays;

//methods
public class String_8 {

    public static void main(String[] args) {
        String name = "jasman singh";
        System.out.println(Arrays.toString(name.toCharArray()));


        System.out.println( name.toUpperCase());
        System.out.println(name.indexOf('n'));
        System.out.println("         jasman       ".strip());  // extra spaces will b e removed
    }
}
