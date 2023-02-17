/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that accepts or reject your package based on its weight and dimensions
*/

import java.util.Scanner;

public class delivery {
	public static void main(String[] args) {
		int length;
		int width;
		int height;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the length for your package: ");
		length = input.nextInt();
		System.out.print("Please enter the width for your package: ");
		width = input.nextInt();
		System.out.print("Please enter the height for your package: ");
		height = input.nextInt();
		if (length > 10 || width > 10 || height > 10) {
			System.out.println("Reject");
		} else if (length <= 10 && width <= 10 && height <= 10) {
			System.out.println("Accept");
		}
		input.close();
	}
}
