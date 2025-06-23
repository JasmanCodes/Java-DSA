import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
// creat an array
        int[] arr = {1,3,2,45,6};


        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 99;  //if u make a change to the object via this ref variablevsame object will be change

    }


}
