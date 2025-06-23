/// /VARIABLE LENGTH ARGUMENTS
import java.util.Arrays;
public class VarArgs {

    public static void main(String[] args) {
   //     fun(2,3,4,56,78,65,23);
        multiple(2,3,"jas", "sparsh", "lop");

    }
    static void multiple(int a, int b, String ...v) {///  variable length arguments always at the end

    }




    static void fun(int ...v) {///  we do this when we dont know how many arguments we r taking ,  this will creayte an array of integers
        System.out.println(Arrays.toString(v));
    }
}
