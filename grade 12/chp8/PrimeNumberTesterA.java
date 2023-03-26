import java.util.Scanner;

public class PrimeNumberTesterA {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print(isPrime(number));

	}
	public static boolean isPrime(int n)
	{
	if (n <= 1)
		return false;
	if (n == 2)
		return true;
	if (n % 2 == 0)
		return false;

	int m = 3;

	while (m * m <= n){
		if (n % m == 0)
			return false;
		m = m + 2;
	}

	return true;
	}
}