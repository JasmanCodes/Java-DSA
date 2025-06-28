package Searching_Algorithms;

import java.util.Arrays;

/////finding the max value in the 2d array
///
public class LinearSearch_7 {

    public static void main(String[] args) {

        int[][] arr = {
                {23,45,63},
                {56,78,2,67,},
                {1,4},
                {34,80,12,6}
        };

        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0][0];
        for (int row=0;row<arr.length;row++){
            for(int col=0; col<arr[row].length; col++){

                if(arr[row][col]>max){
                    max= arr[row][col];


                }
            }
        }
        return max;
    }
}
