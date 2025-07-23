package Recursion_QUE_Easy;
//check if the array is sorted or not
public class Q8 {

    public static void main(String[] args) {

        int[] arr = {2,5,6,3,8,9};
        System.out.println(sorted(arr,0));


    }

    static boolean sorted(int[] arr, int index){

        if(index==arr.length-1){
            return true;
        }
    return arr[index]<arr[index+1] && sorted (arr,index+1);
    }
}
