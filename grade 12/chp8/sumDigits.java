public class sumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(sumOfDigits(1234));

	}

	public static int sumOfDigits(int n) {

		int sum = 0;

		if (n >= 0) {

			while (n > 0) {

				sum += n % 10;
				n /= 10;

			}

		}
		return sum;

	}

}