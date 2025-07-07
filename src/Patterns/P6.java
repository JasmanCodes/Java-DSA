package Patterns;

///         *
///        * *
///       * * *
///      * * * *
///       * * *
///        * *
///         *

public class P6 {
    public static void main(String[] args) {

        pattern5(5);

    }

    static void pattern5(int n){

        for(int row=1;row<2* n;row++){
            int totalColsRow= row>n ? 2*n-row :row;

            int noOfSpaces= n-totalColsRow;
            for(int s =0 ; s< noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0 ;col<totalColsRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
