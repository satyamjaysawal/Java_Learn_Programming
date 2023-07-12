
class MyClass {
    int myVariable; 
    
   
    public MyClass(int value) {
        myVariable = value;
    }
 
    public void myMethod() {
        System.out.println("Hello, I am a method!");
    }
}

public class ClassObj {
    public static void main(String[] args) {
    
        MyClass myObject = new MyClass(10);
       
        System.out.println("myVariable: " + myObject.myVariable);
        myObject.myMethod();
    }
}
