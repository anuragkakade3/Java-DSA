
import java.util.LinkedList;

public class CC {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
        this.data=data;
        this.next=null;
        }
        
    }
    public static Node head;
    public static Node Tail;

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if(head == null){
            head=Tail=newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);

    }
    
}
