/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that find a random number between two inputs
*/

import java.util.Random;
import java.util.Scanner;

public class randomnumber {
	public static void main(String[] args) {
		int minValue;
		int maxValue;
		int randomNumber;
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter your minimum number: ");
		minValue = input.nextInt();
		System.out.print("Enter your maximum number: ");
		maxValue = input.nextInt();
		randomNumber = r.nextInt(maxValue - minValue + 1) + minValue;
		System.out.print("Here's a number between your two numbers: ");
		System.out.println(randomNumber);
		input.close();
	}
}

