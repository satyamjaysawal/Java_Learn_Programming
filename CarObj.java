class car {
    String company; // Instance variable

    public car(String company) {
        this.company = company;
    }
}

public class CarObj {
    public static void main(String[] args) {
        car myCar = new car("Toyota"); // Create an object of the car class
        System.out.println("Car company: " + myCar.company); // Access the company variable
    }
}
