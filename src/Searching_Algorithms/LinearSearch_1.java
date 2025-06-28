package Searching_Algorithms;

public class LinearSearch_1 {
    public static void main(String[] args) {

        int[] nums= {1,45,67,87,32,56,-5,-89};
        int target= 56;

        int ans= linearsearch(nums, target);
        System.out.println(ans);

    }

    //search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearsearch(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for(int index=0;index<arr.length;index++){

            int element= arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statements have been executed
        //hence target not found
        return -1;

    }


}
