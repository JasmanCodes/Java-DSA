import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ch=in.next().trim().charAt(0);

        if(ch >='a'&& ch<='z'){
            System.out.println("lower case");

        }
        else{
            System.out.println("UPPERCASE");
        }



        System.out.println(ch);
    }

}
