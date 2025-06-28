package Searching_Algorithms;
import java.util.Arrays;
import com.sun.jdi.PathSearchingVirtualMachine;

/// ///SEARCHING IN STRINGS

public class LinearSearch_3 {
    public static void main(String[] args) {

        String name= "jasman";
        char target= 'a';
//        System.out.println(search(name,target));          ///// this is for search method

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String str, char target){

        if(str.length()==0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if (ch==target){
                return true;
            }

        }
        return false; // target not found
    }




    static boolean search(String str, char target){

        if(str.length()==0){
            return false;
        }

        for (int i=0; i<str.length();i++){
             if(target == str.charAt(i)){
                 return true;
             }

        }
        return false; // target not found
    }
}
