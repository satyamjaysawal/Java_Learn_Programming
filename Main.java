import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Satyam! Welcome to VSCode.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("You entered: " + n);
        int d;
        int key=scanner.nextInt();
       
        int count = 0;
        while (n > 0) {
            d = n % 10;
            if (key == d) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Frequency of digit " + key + " is: " + count);

        scanner.close();
    }
}
