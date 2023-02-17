/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that checks if a package is heavy or not
*/

import java.util.Scanner;

public class packageCheck {
	public static void main(String[] args) {
		int weight;
		int length;
		int width;
		int height;
		Scanner input = new Scanner(System.in);
		weight = input.nextInt();
		length = input.nextInt();
		width = input.nextInt();
		height = input.nextInt();
		int volume = length * width * height;
		if (weight > 27 && volume > 100000) {
			System.out.println("Too heavy and too large");
		} else if (weight > 27) {
			System.out.println("Too heavy");
		} else if (volume > 100000) {
			System.out.println("Too large");
		} else if (weight <= 27 && volume <= 100000) {
			System.out.println("Pass");
		}
		input.close();
	}
}
