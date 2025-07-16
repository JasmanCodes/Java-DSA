package Basics;
import java.util.Scanner;


    public class Test {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char choice = 'y';
            while (choice == 'y') {

                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " * " + i + " = " + (num * i));
                }

                System.out.print("Do you want to continue? (y/n): ");
                choice = sc.next().charAt(0);
            }


        }
    }


