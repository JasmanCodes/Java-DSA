package Strings;
//strings using recursion
//skipping a character
public class Que_2 {

    public static void main(String[] args) {
     //skip("","baccadah");
        System.out.println(skipAppNotApple("baccappledappah"));
    }

    static void skip(String p, String up){   // p=processed
                                             // up = unprocessed
        if(up.isEmpty()){                     /// if unprocessed is empty it will print the processed one
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);      ///chaeck at 0 th index

        if(ch=='a'){
            skip(p,up.substring(1));  //it will remove the first character that is a
        }
        else{

            skip(p+ch,up.substring(1));  //this will add the character in the processed string



        }

    }
//returning  a string
    static String skip( String up){
        // up = unprocessed
        if(up.isEmpty()){                     /// if unprocessed is empty it will return
            return "";
        }

        char ch = up.charAt(0);      ///check at 0 th index

        if(ch=='a'){
             return skip(up.substring(1));
        }
        else{

            return ch + skip(up.substring(1));



        }

    }

/// now skipping a string
    static String skipApple( String up){
        // up = unprocessed
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{

            return up.charAt(0) + skipApple(up.substring(1));



        }

    }

//only skip app when it is not equal to apple
    static String skipAppNotApple( String up){
        // up = unprocessed
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{

            return up.charAt(0) + skipAppNotApple(up.substring(1));



        }

    }
}
