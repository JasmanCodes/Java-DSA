package Searching_Algorithms;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class LinearSearch_8 {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {

        int count= 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
//Function to check  if the number contains even no of digits or not
    static boolean even(int num) {

        int numberofdigits = digits(num);
        if(numberofdigits %2 ==0){
            return true;
        }
        return false;

    }
    static int digits(int num){

        /// ///for negative numbers convert them to positive
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}
