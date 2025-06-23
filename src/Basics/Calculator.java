
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //take input from user till user does not press X or x
        int ans=0;

        while(true){
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){

                //input 2 numbers
                System.out.print("Enter two numbers: ");
                int num1=in.nextInt();
                int num2=in.nextInt();
                System.out.println();

                if (op=='+') {
                    ans = num1 + num2;
                }
                if (op=='-') {
                    ans = num1 - num2;
                }
                if (op=='*') {
                    ans = num1 * num2;
                }
                if (op=='/') {
                    if(num2!=0){
                    ans = num1 / num2;}
                }
                if (op=='%') {
                    ans = num1 % num2;
                }


                } else if (op=='x'||op=='X') {
                break;
            }
            else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);
        }
    }
}
