package LinkedList;

public class  LL1 {

    private Node head;
    private Node tail;
    private int size;

    public LL1(){
        this.size=0;
    }
//insertion in singly linked list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail=head;
        }

        size+=1;
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;

        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);

        list.display();

    }
}
