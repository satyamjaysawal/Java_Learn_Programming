public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationSteps = 2;

        System.out.println("Original array:");
        printArray(arr);

        rotateLeft(arr, rotationSteps);

        System.out.println("Array after left rotation:");
        printArray(arr);
    }

    // Method to perform left rotation on an array
    public static void rotateLeft(int[] arr, int steps) {
        int n = arr.length;
        steps = steps % n;

        reverse(arr, 0, steps - 1);
        reverse(arr, steps, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Method to reverse elements in an array between start and end indices
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
