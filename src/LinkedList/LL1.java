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

    public int deleteLast() {
        if(size <=1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }


//getting the index of the node to delete from the last
    public Node get(int index){

        Node node = head;
        for(int i =0;i<index;i++){
            node = node.next;
        }
        return node;

    }

// deleting the first element
    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

//displaying
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

       System.out.println(list.deleteFirst());
        list.insert(100,3);

        list.display();

        System.out.println(list.deleteLast());
        list.display();

    }
}
