package Recursion_QUE_Easy;

//Sum of n numbers

public class Q3 {

    public static void main(String[] args) {

        int ans=sum(6);
        System.out.println(ans);

    }

    static int sum(int n){
     if(n<=1){
         return 1;
     }

     return n+sum(n-1);

    }
}
