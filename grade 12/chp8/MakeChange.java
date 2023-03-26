public class MakeChange {

	public static void main(String[] args) {
		int cents = 30;
		int pennies = 0;
		int count = 0;
		for (int q = 0; q * 25 <= cents; q++) {
			for (int d = 0; q * 25 + d * 10 <= cents; d++) {
				for (int n = 0; q * 25 + d * 10 + n * 5 <= cents; n++){
					pennies=cents - (q * 25 + d * 10 + n * 5);
					System.out.println( q + "\t " + d + "\t " + n + "\t " + pennies);
					count++;

				}

			}

		}
		System.out.println(count);
	}
}