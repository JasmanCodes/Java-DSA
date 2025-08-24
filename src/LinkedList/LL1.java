package LinkedList;

public class  LL1 {

    private Node head;
    private Node tail;
    private int size;

    public LL1(){
        this.size=0;
    }
//insertion in singly linked list  fist position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail=head;
        }

        size+=1;
    }
//adding a node at last
    public void insertionLast(int val) {

        if(tail ==null){
            insertFirst(val);
            return;
        }

        Node node= new Node(val);
        tail.next = node;
        tail=node;
        size++;

    }
    //insert at a specific point
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertionLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;



        }

        Node node =new Node(val, temp.next);
        temp.next=node;
        size++;
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
        list.insertionLast(99);
        list.insert(100,3);

        list.display();

    }
}
