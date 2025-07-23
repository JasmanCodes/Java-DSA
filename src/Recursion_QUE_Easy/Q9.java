package Recursion_QUE_Easy;

import java.util.ArrayList;

/// linear search searchin =g for a target in an array
public class Q9 {

     public static void main(String[] args) {

         int[] arr = {5,67,4,1,42,4,90};
         System.out.println(find(arr,12,0));
         findallindex(arr,4,0);
         System.out.println(list);

     }

     static boolean find(int[] arr, int target, int index){
         if(index==arr.length){
             return false;
        }

         return arr[index]==target || find(arr,target,index+1);
     }


     ///  finding all ocurrences
     static ArrayList<Integer> list= new ArrayList<>();
     static void findallindex(int[] arr, int target, int index){
         if(index==arr.length){
             return;
         }

         if(arr[index]==target){
             list.add(index);
         }
         findallindex(arr,target,index+1);
     }
}
