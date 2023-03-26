public class PrintStarTriangle {

	public static void printStarTriangle(int n) {

		for (int i = 0; i < n; i++) {

			for (int x = n - i; x > 1; x--) {
				System.out.print(" ");
			}

			for (int x = 1; x < i + 1; x++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 8;
		printStarTriangle(n);
	}
}