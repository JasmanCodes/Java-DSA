package Strings;
/// string builder
public class String_7 {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);  ///same
        System.out.println(builder.toString());  ///same

        }
    }
//this is the more optimized way through this we can save storage
