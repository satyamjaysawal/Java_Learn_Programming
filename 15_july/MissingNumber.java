public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 4};
        int n = 4;
        int total = n * (n + 1) / 2;

        for (int i : arr) {
            total = total - i;
        }

        System.out.println(total); //missing number is 3
    }
}
