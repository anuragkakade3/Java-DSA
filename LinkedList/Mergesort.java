import java.util.*;

// File name & Class name save as a LinkedList to run the code.
public class Mergesort {
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

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val=head.data;
            head=tail=null;
            size =0;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size =0;
            return val;

        }
// Prev i= size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        size--;
        return val;

    }

    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL =new Node(-1);
        Node temp=mergedLL;

        while(head1!=null&& head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next; 
            
        }
        return mergedLL.next;
    }

public Node mergeSort(Node head){
    if(head==null||head.next==null){
        return head;
    }
    //Find Mid
    Node mid=getmid(head);
    //Left & Right MS
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergeSort(head);
    Node newright=mergeSort(righthead);

    // Merge
    return merge(newleft, newright);
}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print(); 
        
        // Output: 
        //5->4->3->2->1->Null
        //1->2->3->4->5->Null
        

    }
}