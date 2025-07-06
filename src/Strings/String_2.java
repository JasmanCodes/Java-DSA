package Strings;
//comparisons
public class String_2 {
    public static void main(String[] args) {


        String a = "jasman";
        String b = "jasman";
        String c =a;


        // ==
      //  System.out.println(a==b);

        String name1= new String("jasman");
        String name2 = new String("jasman");
        System.out.println(name1==name2);    /// this will give false because both the objects are pointing to dffeernt variables

        System.out.println(name1.equals(name2));  /// this will give true beacuse the value of both is same it only checks the values

        System.out.println(name1.charAt(0));

    }

}
