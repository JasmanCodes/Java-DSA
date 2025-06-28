package Searching_Algorithms;

public class BinarySearch_2 {
    public static void main(String[] args) {

        int[] arr= {90,78,69,46,23,15,3,2,1};
        int target= 23;

        System.out.println(orderagnosticBS(arr,target));

    }

    static int orderagnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;


        //find weather the array is sorted in ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }

        while(start<=end){
            //finding the middle element
            int mid= start+(end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end= mid-1;
                }
                else if( target> arr[mid]){
                    start=mid+1;
                }

            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
