import java.sql.SQLOutput;
import java.util.Scanner;
        public class Temperature {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.print("enter temp in C");

                float tempc = sc.nextFloat();
                float tempf = (tempc*9/5)+32;

                System.out.println(tempf);


            }


        }

