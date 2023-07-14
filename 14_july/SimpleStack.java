import java.util.Stack;

public class SimpleStack {

    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        System.out.println("Elements in stack : "+stk);
        
        
    }
}
