import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        create a stack
        Stack<String> stackOfBooks = new Stack<>();

//        pushing data to the stack
        stackOfBooks.push("MadolDoowa");
        stackOfBooks.push("Gamperaliya");
        stackOfBooks.push("Viragaya");
        stackOfBooks.push("Amba yahaluwo");
        stackOfBooks.push("Geethavaliya");
        stackOfBooks.push("Jane ayre");
        //checking if stack is empty
//        System.out.println(stackOfBooks.empty());

//        to view the stack
        System.out.println(stackOfBooks);

//        to pop an item
        stackOfBooks.pop();

        System.out.println(stackOfBooks);

        String bookAtthetop = stackOfBooks.peek();
        System.out.println(" this is the book in the top "+ bookAtthetop);


    }
}
