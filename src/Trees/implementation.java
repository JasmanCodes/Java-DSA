package Trees;

import java.util.Scanner;

//Binary trees
public class implementation {

    public implementation(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("enter the root Node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("do you want to enter left of"+ node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("enter the value of the left of" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("enter the value of the left of" + node.value);
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("enter the value of the left of" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }


    }

    public void display(){
        display(root, "");

    }
    private display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right + indent + "\t")

    }
}
