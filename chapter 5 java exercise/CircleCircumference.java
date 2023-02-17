/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that calculates the circumference of a circle
*/

import java.util.Scanner;

public class CircleCircumference {
	public static void main(String[] args) {
		int radius;
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your circle's radius: ");
		radius = input.nextInt();
		if (radius < 0) {
			System.out.println("Negative radii are illegal!");
		} else {
			double circleCircumference = 2 * PI * radius;
			System.out.print("Your circle circumference is: ");
			System.out.println(circleCircumference);
		}
		input.close();
	}
}
