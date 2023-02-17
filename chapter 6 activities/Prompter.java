/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/


import java.util.Scanner;

public class Prompter {
    public static void main(String[] args) {
        int minValue, maxValue, midValue;      //Introduces variables to the program
        Scanner input = new Scanner(System.in);     //Introduces the Scanner
        System.out.print("Min value: ");     //Prompts the user for a minimum value
        minValue = input.nextInt();     //Takes the user's input
        System.out.print("Max value: ");     //Prompts the user for a maximum value
        maxValue = input.nextInt();     //Takes the user's input
        System.out.print("Please enter a value that is between your two other values: ");   //Prompts the user for a value that is in between the user's other values
        midValue = input.nextInt();     //Takes the user's input
        while (midValue <= minValue || midValue >= maxValue){   //A while loop that keeps prompting the user for a value for as long as the user's value is not in between their two other values.
            System.out.print("Please enter a value that is between your two other values: ");
            midValue = input.nextInt();
        }
        input.close();
    }
}