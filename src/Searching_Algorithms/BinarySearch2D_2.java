package Searching_Algorithms;

import java.util.Arrays;

public class BinarySearch2D_2 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {

                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;

            } else {
                cend = mid - 1;

            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;  // be cautious , matrix may be empty;
        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);


        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rstart < (rend - 1)) {//while this is true it will have more than 2 rows

            int mid = rstart + (rend - rstart) / 2;

            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }

        }
        //now we have two rows
        //check weather the target is in the coloumn of 2 rows

        if (matrix[rstart][cmid] == target) {

            return new int[]{rstart, cmid};
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        //search in 1st half
        if (target <= matrix[rstart][cmid - 1]) {
            return binarysearch(matrix, rstart, 0, cmid - 1, target);
        }
        //search in 2nd half
        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
            return binarysearch(matrix, rstart, cmid + 1, cols - 1, target);
        }
        //search in 3rd half
        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binarysearch(matrix, rstart + 1, 0, cmid - 1, target);
        }
        //search in 4th half
        if (target >= matrix[rstart + 1][cmid + 1]) {
            return binarysearch(matrix, rstart + 1, cmid + 1, cols - 1, target);
        }
        return new int[]{-1, -1}; // if the element is not found

    }

}
