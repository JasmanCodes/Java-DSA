package Recursion;
/// Binary search
public class Recursion_3  {

    public static void main(String[] args) {

        int[] arr = {3,5,6,8,12,45,67,89};
        int target= 67;

        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int[] arr, int target, int s, int e){

        if(s>e) {
            return -1;
        }

        int m= s + (e - s)/2;

        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }

        return search(arr, target, m+1, e);
    }
}
