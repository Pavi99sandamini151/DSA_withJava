import java.util.LinkedList;
import java.util.Queue;

public class Queues {
        public static void main(String [] args) {
            Queue<String> newqueue = new LinkedList<>(); {
                newqueue.offer("John");
                newqueue.offer("Doe");
                newqueue.offer("pavi");

                System.out.println(newqueue.isEmpty());
                System.out.println(newqueue.size());

                System.out.println(newqueue.contains("pavi"));
//                first one in the queue = LIFO
                System.out.println(newqueue.peek());

                newqueue.poll();
                newqueue.poll();
                newqueue.poll();
                System.out.println(newqueue);
            }
}}
