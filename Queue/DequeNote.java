import java.util.Deque;
import java.util.LinkedList;

public class DequeNote {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(1);
        System.out.println(d);
        d.removeFirst();
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
    }
}