package Searching_Algorithms;


///// Searching in range
public class LinearSearch_4 {
/// Q- search in the range of index
    public static void main(String[] args) {

    int[] nums= {34,56,73,24,98,76,12,34,67};
    int target= 34;
        System.out.println(range(nums,target,1,6));

    }
    static boolean range(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return false;
        }
        for(int index=start; index<end;index++){
            int element=arr[index];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
