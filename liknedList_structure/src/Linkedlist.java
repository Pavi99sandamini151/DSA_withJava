import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){
        LinkedList<String> linkedlist1 = new LinkedList<String>();

//        using as stack
//        linkedlist1.push("A");
//        linkedlist1.push("B");
//        linkedlist1.push("C");
//        linkedlist1.push("D");
//        linkedlist1.push("E");

//        System.out.println(linkedlist1);
//
//        linkedlist1.poll();

//        as queue
        linkedlist1.offer("A");
        linkedlist1.offer("B");
        linkedlist1.offer("C");
        linkedlist1.offer("D");
        linkedlist1.offer("E");
        System.out.println(linkedlist1);

//        linkedlist1.poll();
        linkedlist1.add(4, "F");
        System.out.println(linkedlist1);
        linkedlist1.remove("B");
        System.out.println(linkedlist1);
        linkedlist1.addFirst("Q");
        System.out.println(linkedlist1);
        linkedlist1.addLast("R");
        System.out.println(linkedlist1);
    }
}
