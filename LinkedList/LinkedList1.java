import java.util.*;

// File name save as a LinkedList to run the code.
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
    }

    public static void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;    
        }
        size++;
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    
    public int itrsearch(int key){
        Node temp=head;
        int i =0;
        while(temp!=null){
            if(temp.data==key){
        return i;
    }
        temp=temp.next;
        i++;
    }
        return -1;
    }
    


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3); 
        ll.addLast(4);
        ll.add(3,4);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(10));
    }
}
// O/P:- 1->2->3->4->4->5->Null
        // 2
//         -1
