package Searching_Algorithms;
import java.util.Arrays;
/// matrix is sorted in a row and colomn format
public class BinarySearch2D_1 {

    public static void main(String[] args) {

        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,47},
                {33,34,38,50}
        };
        int target= 37;
        System.out.println(Arrays.toString(search(arr,49 )));


    }

    static int[] search(int[][] matrix, int target){

        int r= 0;
        int c= matrix.length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
