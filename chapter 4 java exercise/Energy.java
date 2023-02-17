/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class Energy {

	public static void main(String[] args) {
		final double speedStep1 = 3 * 100000000;	//Step one of finding the speed.
		double speedStep2 = speedStep1 * speedStep1;	//Step two of finding the speed.
		double m;	//The mass.
		Scanner input = new Scanner(System.in);	//The scanner object.
		DecimalFormat df = new DecimalFormat("###,###");
				
		m = input.nextDouble();
		double energy = m * speedStep2;
		System.out.println(df.format(energy));
		double lightBulbs = energy/360000;
		System.out.println(df.format(lightBulbs));
				
		input.close();


	}

}