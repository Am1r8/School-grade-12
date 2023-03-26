public class PerfectSquareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(isPerfectSquare(56));

	}
	public static boolean isPerfectSquare(int n){
		int sum = 0;
		int term = 1;
		while (sum < n){

			sum += term;
			term += 2;

		}
		if (sum == n){

			return true;

		} else{

			return false;

		}

	}

}