package Strings;

public class Que {

    public static void main(String[] args) {

        String str = "abcdcj";
        System.out.println(ispalindrome(str));

    }

    static boolean ispalindrome(String str) {
        str = str.toLowerCase();
        for (int i=0; i<=str.length()/2;i++){

            char start = str.charAt(i);
            char end=str.charAt(str.length() - 1-i);

            if(start!=end){
                return false;
            }

        }
        return true;
    }
}
