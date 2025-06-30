package Searching_Algorithms;
/// Find positions of an element in a sorted array of infinite numbers
public class BS_Que {

    public static void main(String[] args) {

        int[] arr= {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(range(arr, target));


    }

    static int range(int[]arr, int target){

        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int temp =end+1;  //this is our new start

            //double the box value
            // end = previous end + sizeofbox*2
            end= end + (end-start+1)*2;
            start = temp;


        }
        return binarysearch( arr,  target,  start,  end);


    }
    static int binarysearch(int[] arr, int target, int start,int end){

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
