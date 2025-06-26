package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
   Scanner in= new Scanner(System.in);

        //syntax
  ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(66);
//        list.add(65);
//        list.add(64);
//        list.add(672);
//        list.add(671);
//
//        System.out.println(list);
//       // System.out.println(list.contains(64);
//
//        list.set(1,45);
//        list.remove(2);

        //input

        for(int i=0; i< 5; i++){

            list.add(in.nextInt());
        }
// get item from index
        for (int i=0; i<5; i++);{
            System.out.println(list.get(0));  //pass the index
        }
        System.out.println(list);


    }
}
