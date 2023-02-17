/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that checks the price of prints and etc
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class printer {
	public static void main(String[] args) {
		int numberOfCopies;
		final double FIRST_PRICE = 0.30;
		final double SECOND_PRICE = 0.28;
		final double THIRD_PRICE = 0.27;
		final double FOURTH_PRICE = 0.26;
		final double FIFTH_PRICE = 0.25;
		double priceOfAllCopies;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		numberOfCopies = input.nextInt();
		if (numberOfCopies >= 0 && numberOfCopies <= 99) {
			System.out.println(df.format(FIRST_PRICE));
			priceOfAllCopies = numberOfCopies * FIRST_PRICE;
			System.out.println(df.format(priceOfAllCopies));
		} else if(numberOfCopies >= 100 && numberOfCopies <= 499) {
			System.out.println(df.format(SECOND_PRICE));
			priceOfAllCopies = numberOfCopies * SECOND_PRICE;
			System.out.println(df.format(priceOfAllCopies));
		} else if(numberOfCopies >= 500 && numberOfCopies <= 749) {
			System.out.println(df.format(THIRD_PRICE));
			priceOfAllCopies = numberOfCopies * THIRD_PRICE;
			System.out.println(df.format(priceOfAllCopies));
		} else if(numberOfCopies >= 750 && numberOfCopies <= 1000) {
			System.out.println(df.format(FOURTH_PRICE));
			priceOfAllCopies = numberOfCopies * FOURTH_PRICE;
			System.out.println(df.format(priceOfAllCopies));
		} else if(numberOfCopies > 1000) {
			System.out.println(df.format(FIFTH_PRICE));
			priceOfAllCopies = numberOfCopies * FIFTH_PRICE;
			System.out.println(df.format(priceOfAllCopies));
		}
		input.close();
	}
}
