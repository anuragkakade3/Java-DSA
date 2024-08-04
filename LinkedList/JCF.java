import java.util.Collections;
import java.util.LinkedList;

public class JCF {
    public static void main(String[] args) {
        LinkedList <Integer> ll=new LinkedList<>();
        ll.add(5);
        ll.addFirst(25);
        ll.addLast(1);
        System.out.println(ll);
        //ll.removeLast();
        //ll.removeFirst();
        //System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);

    }
}
