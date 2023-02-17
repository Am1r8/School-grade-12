/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that finds the age of a person
*/

import java.util.Scanner;

public class stages {
	public static void main(String[] args) {
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an age: ");
		age = input.nextInt();
		if (age <= 18) {
            if(age <= 5) {
                System.out.println("toddler");
            } else {
                if (age <= 10) {
                    System.out.println("child");
                } else {
                    if (age <= 12) {
                        System.out.println("preteen");
                    } else {
                        System.out.println("teen");
                    }
                }
            }
        } else {
            System.out.println("adult");
        }
		input.close();
	}
}