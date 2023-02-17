/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that you have to guess the number that computer generates
*/

import java.util.Scanner;
import java.util.Random;

public class guessingGame {
	public static void main(String[] args) {
        int number;
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random r = new Random(seed);
		int guess = input.nextInt();
		number = r.nextInt(10)+1;
		if(guess == number){
		    System.out.println("WINNER");
		} else{
		    System.out.println("LOSER");
		}
		input.close();
	}
}
