package Searching_Algorithms;


//if i want to return the element
public class LinearSearch_2 {

    public static void main(String[] args) {

        int[] nums= {1,34,56,78,54,23,61,90};
        int target= 61;
        int ans=linearsearch2(nums,target);
        System.out.println(ans);

    }

    static int linearsearch2(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){

            int element=arr[index];
            if(element==target){
                return element;
            }

        }
        return -1;
    }
}
