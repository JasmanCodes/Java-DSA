import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int empid=in.nextInt();
        String department= in.next();

        switch(empid){
            case 1:
                System.out.println("jasman");
            break;
            case 2:
                System.out.println("sparsh");
            break;
            case 3:
                System.out.println("raj");
                switch(department){
                case "IT":
                    System.out.println("it department");
                    break;
                    case "mechanical":
                        System.out.println("mechanical deparment");
                        break;
                    default:
                        System.out.println("enter a valid department");

            }
            break;
            default:
                System.out.println("enter a valid empid");

        }



    }
}
