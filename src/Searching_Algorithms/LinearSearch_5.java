package Searching_Algorithms;

/////Finding minimum number

public class LinearSearch_5 {
    public static void main(String[] args) {
        int[] arr= {18,45,67,-8,34,67,89,90};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
       static int min(int[] arr){
             int ans= arr[0];

             for (int i=1;i<arr.length;i++){

                 if(arr[i]<ans){
                     ans=arr[i];
                 }
             }
       return ans;
       }
}
