import java.util.Scanner;
public class conditional {

    public static void main(String[] args) {
      /*syntax of if statements:
      if (boolean expression true or false){
         //body
        }else{
        //do this
        }
       */


        //int salary = 25000;
        Scanner src=new Scanner(System.in);
        System.out.println("enter ur salary");
        int salary=src.nextInt();


        if(salary>24000){
            salary=salary+2000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println("new salary after bonus is" + salary);
    }
}
