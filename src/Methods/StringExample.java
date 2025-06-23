public class StringExample {

    public static void main(String[] args) {

//        String display=greet();
//        System.out.println(display);

        String display= mygreet("Jasman_singh");
        System.out.println(display);

    }

    static String mygreet(String name){

        String message= "hiiiii " + name;
        return message;

    }








    static  String greet() {

        String greet= "how r u";
                return greet;
    }
}
