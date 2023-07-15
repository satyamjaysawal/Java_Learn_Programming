import java.util.Stack;

public class SimpleStack {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        System.out.println("Elements in stack: " + stk);

        int firstTop = stk.peek();
        System.out.println("Top element: " + firstTop);

        stk.pop();
        System.out.println("Pop element is: " + firstTop);

        int newTop = stk.peek();
        System.out.println("New top element: " + newTop);

        boolean isEmpty = stk.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
        
    }
}
