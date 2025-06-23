import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {


    Scanner in= new Scanner(System.in);
    //String Fruit=in.next();

/*switch (Fruit) {
        case "mango":
            System.out.println("King of fruits");
            break;
        case "apple":
            System.out.println("red");
            break;
        case "orange":
            System.out.println("round");
            break;
        case "grapes":
            System.out.println("small");
            break;
        default:
            System.out.println("please enter a valid fruit");
    }*/





        /**************different syntax*//// //////



     int day=in.nextInt();
//
//       switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("fri");
//            case 6 -> System.out.println("sat");
//            case 7 -> System.out.println("sun");
//            default -> System.out.println("please enter a valid fruit");
//
//        }




        /************to check weekend and weekday we dont need break statement*//// ////


        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }


        /********** OR **********/

        switch (day){
        case 1,2,3,4,5 -> System.out.println("weekday");
        case 6,7 -> System.out.println("weekend");

    }


}}