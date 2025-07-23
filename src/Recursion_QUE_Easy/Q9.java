package Recursion_QUE_Easy;
 /// linear search searchin =g for a target in an array
public class Q9 {

     public static void main(String[] args) {

         int[] arr = {5,67,4,1,42,12,90};
         System.out.println(find(arr,12,0));

     }

     static boolean find(int[] arr, int target, int index){
         if(index==arr.length){
             return false;
        }

         return arr[index]==target || find(arr,target,index+1);
     }
}
