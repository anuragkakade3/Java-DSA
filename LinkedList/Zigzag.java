import java.util.*;

// File name & Class name save as a LinkedList to run the code.
public class Zigzag {
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

      



public void zigzag(){
    // find Mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&& fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;

    //Reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    Node left=head;
    Node right=prev;
    Node nextL,nextR;

    //alt merge - zig zag merge
    while(left!=null && right !=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;
    }




}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
       
        ll.print();
        ll.zigzag();
        ll.print();
        
        // Output: 
        //5->4->3->2->1->Null
        //5->1->4->2->3->Null

        

    }
}