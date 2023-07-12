public class OneObj {
    public void printAge(int age) {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        OneObj obj = new OneObj();
        obj.printAge(23);
        
        TwoObj twoObj = new TwoObj();
        twoObj.oddEven(40);
    }
}

class TwoObj {
    public void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
