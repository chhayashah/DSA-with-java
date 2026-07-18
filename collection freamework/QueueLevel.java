import java.util.*;
public class QueueLevel {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println("Removing: " + q.poll());
        System.out.println(q);
        System.out.println(q.peek());
    }
}
