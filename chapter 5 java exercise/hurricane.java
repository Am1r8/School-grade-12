/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that find the hurrican's speed
*/

import java.util.Scanner;

public class hurricane {
	public static void main(String[] args) {
		int category;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of the hurricane category that you want to see the wind speed of: ");
		category = input.nextInt();
		switch (category) {
		case 1:
			System.out.println("The wind speed for your selected category is: 74-95 mph or 64-82 kt or 119-153 km/hr");
			break;
		case 2:
			System.out.println("The wind speed for your selected category is: 96-110 mph or 83-95 kt or 154-177 km/hr");
			break;
		case 3:
			System.out.println("The wind speed for your selected category is: 111-130 mph or 96-113 kt or 178-209 km/hr");	
			break;
		case 4:
			System.out.println("The wind speed for your selected category is: 131-155 mph or 114-135 kt or 210-249 km/hr");	
			break;
		case 5:
			System.out.println("The wind speed for your selected category is: Greater than 155 mph or 135 kt or 249 km/hr");	
			break;
		}
		input.close();
	}
}
