import java.util.*;

public class PalindromeLL {
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

    public Node FindMid(Node head){// Helper
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2

        }
        return slow;
    }

    public boolean Palindrome(){
        if(head==null||head.next==null){
            return true;
        }
        // Find Node
        Node findMid=FindMid(head);

        // Reverse 2nd Half
        Node prev=null;
        Node curr=findMid.next;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //Cheak left half & right half

        while (right!=null) { 
            if(left.data!=right.data){
                return false;

            }
            left=left.next;
            right=right.next;

        }
        return true;

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
        System.out.println(ll.Palindrome());
        
       
        

    }
}
