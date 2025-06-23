import java .util. Scanner;
public class ConditionalLoops {
    public static void main(String[] args) {

        /*syntax of For loops:

        for (initialisation; condition; increment/decrement){
        //body}
         */

        //Q print numbers from 1 to 5
        /*for (int i=1; i<=5; i++){
            System.out.println(i);
*/
//other way
       /* for (int i=1; i<=5; i+=2){
            System.out.println(i);

            */

        //Q print number from 1 to n

        /*Scanner num= new Scanner(System.in);

        int n=num.nextInt();

        for (int i=1; i<=n;i++){

            System.out.println(i);
        }

*/


        /**************** While LOOP**************/

        //Syntax
        /* while(condition){
        body}
         */

/*
        int num=1;     //initialisation will come outside
        while(num<=5){                     //condition
            System.out.println(num);
            num++;                           //increment/decrement
        }
*/







        /**************** do-while loop *************/

        //Syntax

        /*do{

        }while(condition);
         */

        int n=1;     //initializater
        do{
            System.out.println(n);
            n++;

        }while(n<=7);

        }
    }

