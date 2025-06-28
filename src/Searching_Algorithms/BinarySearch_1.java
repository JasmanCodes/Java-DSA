package Searching_Algorithms;

public class BinarySearch_1 {
    public static void main(String[] args) {
//sorted array ascending order
        int[] arr = {5,10,45,49,80,89,90,91,99,100};
        int target= 90;

        System.out.println(binarysearch(arr,target));

    }
    //return the index
    //return -1 if the element does not exist
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //finding the middle element
            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end= mid-1;
            }
            else if( target> arr[mid]){
                start=mid+1;
            }
            else{
                // answer found
                return mid;
            }
        }
        return -1;
    }


}
