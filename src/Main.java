import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Node n1 = new Node("...Node1 Data...");
        Node n2 = new Node("!!!Node2 Data!!!");
        Node n3 = new Node("???Node3 Data???");
        Node n4 = new Node("***Node4 Data***");
        Node n5 = new Node("===Node5 Data===");

        n1.setNext(n2);



        LinkedList ll = new LinkedList(n1);

        ll.printList();

        //inserting node to front
        ll.insertToFront(n5);
        System.out.println("\nAfter inserting node 5 to front: ");
        ll.printList();

        //inserting data to front
        ll.insertToFront("Random data");
        System.out.println("\nAfter inserting data to front: ");
        ll.printList();







    }
}
class Node{
    String data;
    Node next;

    public Node(String data){
        this.data = data;
        next = null;
    }
    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }

}
class LinkedList{
    private Node head;

    public LinkedList(){
        head = null;
    }
    public LinkedList(Node head){
        this.head = head;
    }

    public void setHead(Node head){
        this.head = head;
    }
    public Node getHead(){
        return head;
    }

    public void insertToFront(Node n){
        n.setNext(head);
        head = n;
    }
    public void insertToFront(String data){
        Node n = new Node(data);
        n.setNext(head);
        head = n;
    }

    public void printList(){
        if(this.getHead() != null){
            Node curr = head;
            System.out.println(curr.getData());
            while(curr.getNext() != null){
                curr = curr.getNext();
                System.out.println(curr.getData());
            }
        }
    }
}