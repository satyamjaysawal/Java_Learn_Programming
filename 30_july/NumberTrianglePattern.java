
public class NumberTrianglePattern {
    public static void printPattern(int n)
	{
		int i, j;
		for (i = 1; i <= n; i++) {
			// inner loop to print space
			for (j = 1; j <= n - i; j++) {
				System.out.print("r");
			}
			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}
