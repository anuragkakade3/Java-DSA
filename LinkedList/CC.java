
import java.util.*;

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
    public static void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        CC.print();
        ll.addFirst(2);
        CC.print();
        ll.addFirst(1);
        CC.print();
        ll.addLast(3);
        CC.print();
        ll.addLast(4);
        CC.print();

    }
    
}
/* 
O/P:
 * LL is empty
 * 2 null
 * 1 2 null
 * 1 2 3 null
 * 1 2 3 4 null
 */