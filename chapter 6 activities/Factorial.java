/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    int num, factorial = 1;   //Introduces the variables to the program
    Scanner input = new Scanner(System.in);  //Introduces the scanner
    System.out.println("Enter a number: ");     //Prompts the user for a number
    num = input.nextInt();  //Takes ther user's input
    input.close();
    do{     //A do while loop that calculates the factorial for as long as num is more than 0
        factorial = factorial * num;
        num -= 1;
    } while(num > 0);
        System.out.println("Factorial: " + factorial);
    }
}