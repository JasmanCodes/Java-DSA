package Patterns;

/// *
/// **
/// ***
/// ****
/// *****
/// ****
/// ***
/// **
/// *

public class P5 {

    public static void main(String[] args) {

        pattern5(5);

    }

    static void pattern5(int n){

        for(int row=1;row<2*n   ;row++){
            int totalColsRow= row>n ? 2*n-row :row;
            for(int col=0 ;col<totalColsRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
