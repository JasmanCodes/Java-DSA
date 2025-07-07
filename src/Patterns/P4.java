package Patterns;
/// 1
/// 12
/// 123
/// 1234
public class P4 {

    public static void main(String[] args) {

        pattern4(5);

    }

    static void pattern4(int n){

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
