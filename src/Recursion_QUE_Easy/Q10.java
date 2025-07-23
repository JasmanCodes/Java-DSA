package Recursion_QUE_Easy;
//RETURNING AN ARRAY LIST


import java.util.ArrayList;


public class Q10 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,78,62};
        System.out.println(findallindex2(arr,4,0));

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

    /// returning the arraylist without passing the list in the argument

    static ArrayList<Integer> findallindex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        /// this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);

        }
        ArrayList<Integer> ansFromBelowCalls= findallindex2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}

