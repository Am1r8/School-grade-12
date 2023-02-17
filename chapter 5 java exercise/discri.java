/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that finds the discriminant of the numbers
*/

import java.util.Scanner;

public class discri {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		a = input.nextInt();
		System.out.print("Enter the value for b: ");
		b = input.nextInt();
		System.out.print("Enter the value for c: ");
		c = input.nextInt();
		int discriminantStep1 = b * b;
		int discriminantStep2 = 4 * a * c;
		int discriminantFinal = discriminantStep1 - discriminantStep2;
		if (discriminantFinal < 0) {
			System.out.println("No roots");
		} else if (discriminantFinal == 0) {
			System.out.println("One root");
		} else if (discriminantFinal > 0) {
			System.out.println("Two roots");
		}
		input.close();
	}
}
