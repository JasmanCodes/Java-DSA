package Bitwise_Operators;
//unique number
public class Bitwise_2 {

    public static void main(String[] args) {

        int[] arr = {2,3,3,2,5,6,5,4,7,4,7};
        System.out.println(isUnique(arr));
    }

    static int isUnique(int[] arr){

        int unique=0;

        for(int i: arr){

            unique=unique^i;
        }
        return unique;
    }

}
