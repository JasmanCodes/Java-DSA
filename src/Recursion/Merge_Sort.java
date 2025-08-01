package Recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge( left,  right );
    }

    static int[] merge (int[] first, int[] second){

        int[] mix= new int[first.length + second.length];   ///creating a new array where sorted arrays will be stores

        int i = 0;  //pointer at first half
        int j=0;   //pointer at secondhalf
        int k=0;   //pointer at new array

        while(i< first.length && j< second.length){

            if(first[i]<second[j]){
                mix[k]= first[i];
                i++;
            }

            else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        // it may be possibile that one of the arrays is not complete
        // copying the remaining element
        while(i< first.length){
            mix[k]= first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]= second[j];
            j++;
            k++;
        }

        return mix;
    }
}
