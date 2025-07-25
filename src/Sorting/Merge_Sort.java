package Sorting;

import java.util.Arrays;

public class Merge_Sort {

    public static void main(String[] args) {
   int[]arr = {5,4,3,2,1};
   mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }

        int mid = s + (e-s)/2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e );
    }

    static void mergeInPlace (int[] arr, int s,int m, int e){

        int[] mix= new int[e-s];   ///creating a new array where sorted arrays will be stores

        int i = s;  //pointer at first half
        int j=m;   //pointer at secondhalf
        int k=0;   //pointer at new array

        while(i< m && j< e){

            if(arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }

            else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // it may be possibile that one of the arrays is not complete
        // copying the remaining element
        while(i< m){
            mix[k]= arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]= arr[j];
            j++;
            k++;
        }

        for(int l=0; l< mix.length; l++){
            arr[s+l] = mix[l];

    }

    }
}
