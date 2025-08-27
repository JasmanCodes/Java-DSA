package LinkedList;

public class LL3 {

    private Node head;
    private Node tail;

    public LL3(){

        this.head = null;
        this.tail = null;

    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null ){
            head =node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next=head;
        tail=node;
    }

    public void display() {
         Node node = head;
         if(head!=null){
             do{
                 System.out.print(node.val + "->");
                 node= node.next;
             } while(node!=head);
         }
        System.out.println("Head");
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node !=head);

    }



    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val=val;

        }
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.insert(4);
        list.insert(18);
        list.insert(6);
        list.insert(76);
        list.insert(23);

        list.delete(18);
        list.display();
    }
}
