public class Example {
    private int counter;
    public void incrementCounter(){
        counter++;
    }



    public static void main(String[] args) {
        Example example = new Example();
        example.incrementCounter();
        System.out.println("Counter is "+ example.counter);
    }
}
