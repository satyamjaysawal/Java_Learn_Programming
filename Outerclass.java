class Outerclass {
    private int outerData;

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    public class InnerClass {
        public void innerMethod() {
            outerData = 10;  // Accessing the outer class member
            System.out.println("Inner method: " + outerData);
        }
    }

    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        outer.outerMethod();
    }
}
