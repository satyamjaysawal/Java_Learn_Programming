import java.util.Scanner;

public class GeeksForGeeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("tttt"); // Print leading spaces
            }
            for (int j = i; j >= 1; j--) {
                System.out.format("%4d", j); // Print numbers in descending order
            }
            for (int j = 2; j <= i; j++) {
                System.out.format("%4d", j); // Print numbers in ascending order
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
