import java.util.EmptyStackException;

class Stack {
  private int maxSize;
  private int top;
  private int[] stackArray;
  public Stack(int maxSize){
    this.maxSize=maxSize;
    this.top = -1;
    this.stackArray=new int [maxSize];

  }
  public void push(int value){
    if(isFull()){
        throw new StackOverflowError("Stack is full");
    }
    stackArray[++top]=value;
  }
  public int pop(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    return stackArray[top--];
  }
  public int peek(){
    if (isEmpty()){
        throw new EmptyStackException();
    }
    return stackArray[top];
  }
  public boolean isEmpty() {
    return (top == -1);
}

public boolean isFull() {
    return (top == maxSize - 1);
}

public int size() {
    return top + 1;
}

public static void main(String[] args) {
    Stack stack=new Stack(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("size of the Stack : "+ stack.size());
    System.out.println("Top element : "+ stack.peek());

    int poppedElement = stack.pop();
    System.out.println("Popped element : "+ poppedElement);
    System.out.println("Is the stack empty?" + stack.isEmpty());

}

}


