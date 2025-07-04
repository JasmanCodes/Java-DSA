package Sorting;
import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr= {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
    //run the steps n-1 times
boolean swapped;
        for (int i=0; i<arr.length;i++){
            swapped=true;
            //for each step max item will come at the last respective index
            for (int j=1;j<arr.length-i;j++){
                //swap if the item is smaller thean the previous of j
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if it didnt swapp for any valur of i the loop will break
            if(!swapped){
                break;
            }
        }

    }
}
