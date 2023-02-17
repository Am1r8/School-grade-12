/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/


import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        int number, oddSum = 0;     //Introduces the variables
        Scanner input = new Scanner(System.in);     //Introduces the scanner
        System.out.print("Please enter a number: ");    //Prompts the user for a number
        number = input.nextInt();    //Takes the user's input
        for(int i = 1; i <= number; i++)    //For loop that calculates the oddSum of the number
        {
            if(i % 2 != 0)
            {
                oddSum = oddSum + i; 
            }
        }
        System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);     //Displays the results
        input.close();
    }
}