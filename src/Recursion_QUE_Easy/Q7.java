package Recursion_QUE_Easy;
//counting the number of zeroes in a digit
public class Q7 {
    public static void main(String[] args) {

        System.out.println(count(300560780));

    }
/// special pattern ,how to pass a value to above calls
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);


    }
}
