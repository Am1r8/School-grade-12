public class Population {

	public static void main(String[] args) {
		double population = 106.2;
		int year = 2005;

		while (population < 120){

			population = population + (population * 0.017);
			year++;

		}

		System.out.print(year);

	}

}