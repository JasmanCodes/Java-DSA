package Recursion;
//building a triangle

/**  ****
     ***
     **
     *
 **/
public class Pattern_Recursion {

    public static void main(String[] args) {
    triangle2(4,0);
    }
    static void triangle (int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }
    }

    static void triangle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle2(r,c+1);
            System.out.print("*");

        }
        else{
            triangle2(r-1,0);
            System.out.println();

        }
    }

}
