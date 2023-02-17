/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that checks if a wave height is good for surfing or swimming
*/

import java.util.Scanner;

public class allTheSurfes {
	public static void main(String[] args) {
		int WaveHeight;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the wave height: ");
		WaveHeight = input.nextInt();
		if (WaveHeight >= 6) {
			System.out.println("Great day for surfing!");
		} else if (WaveHeight >= 3) {
			System.out.println("Go body boarding!");
		} else if (WaveHeight > 0) {
			System.out.println("Go for a swim!");
		} else {
			System.out.println("Whoa! What kind of surf is that?");
		}
		input.close();
	}
}
