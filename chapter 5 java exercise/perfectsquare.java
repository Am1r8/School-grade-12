/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that checks if a number is a perfect square
*/

import java.lang.Math;
import java.util.Scanner;

public class perfectsquare {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		number = input.nextInt();
		double squareRoot = Math.sqrt(number);
		int squareRootTruncated = (int)squareRoot;
		int squaredResult = squareRootTruncated * squareRootTruncated;
		if(number == squaredResult){
			System.out.println("Your number is a perfect square!");
		} else {
			System.out.println("Your number is not a perfect square");
		}
		input.close();
	}
}
