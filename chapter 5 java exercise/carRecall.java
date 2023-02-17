/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that checks if a car number is safe to drive
*/

import java.util.Scanner;

public class carRecall {
	public static void main(String[] args) {
		int modelOfCar;
		Scanner input = new Scanner(System.in);
		modelOfCar = input.nextInt();
		if(modelOfCar == 119 || modelOfCar == 179 || modelOfCar >= 189 && modelOfCar <= 198 || modelOfCar >= 221 || modelOfCar >= 780) {
			System.out.println("Not Safe");
		} else {
			System.out.println("Safe");
		}
		input.close();
	}
}
