import java.util.Scanner;

public class IntegerSum {

	public static void main(String[] args) {

			int integer;
			int counter = 0;
			int total = 1;
			Scanner input = new Scanner(System.in);
			integer = input.nextInt();

			if (integer > 0 && integer < 10){

				while (counter < integer - 1){

					counter++;
					System.out.print(counter + " + ");
					total = total + counter + 1;

				}
				System.out.print(integer + " = ");
				System.out.print(total);

			}


	}

}