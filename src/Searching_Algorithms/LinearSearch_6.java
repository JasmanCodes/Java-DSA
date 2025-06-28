package Searching_Algorithms;
import java.util.Arrays;

//searching in 2d arrays

public class LinearSearch_6 {
    public static void main(String[] args) {

        int[][] arr = {
                {23,45,63},
                {56,78,2,67,},
                {1,4},
                {34,80,12,6}
        };

        int target= 80;
        int[] ans = search(arr,target);    // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{};
        }
        for (int row=0;row<arr.length;row++){
            for(int col=0; col<arr[row].length; col++){

                if(arr[row][col]==target){
                    System.out.println("element found");
                    return new int[] {row,col};
                }
            }
        }

return new int[]{};
    }
}
