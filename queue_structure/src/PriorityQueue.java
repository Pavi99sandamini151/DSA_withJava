import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){
        Queue<Double> queuep = new java.util.PriorityQueue<>(Collections.reverseOrder());

//        average of marks in a class
        queuep.offer(30.3);
        queuep.offer(90.45);
        queuep.offer(56.5);
        queuep.offer(49.1);

        while(!queuep.isEmpty()) {
            System.out.println(queuep.poll());
        }
    }
}
