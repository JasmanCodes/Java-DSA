package Recursion_QUE_Easy;
//RETURNING AN ARRAY LIST


import java.util.ArrayList;


public class Q10 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,78,62};
        System.out.println(findallindex(arr,4,0,new ArrayList<>()));

    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);

        }
        return findallindex(arr,target,index+1,list);
    }
}

