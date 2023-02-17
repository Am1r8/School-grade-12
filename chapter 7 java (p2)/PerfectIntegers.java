/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class PerfectIntegers {
    public static void main(String[] args) {
    int num; // declare variable
    Scanner input = new Scanner(System.in); // declare scanner
    System.out.print("Please enter an integer: "); // prompt user for input
    num = input.nextInt(); // assign input to variable
    if (isPerfect(num)) { //If statement that checks if the number entered is a prefect integer or not by using the isPerfect method.
        System.out.println(num + " is a perfect integer!"); // print to the screen
    } else { // if the number is not perfect
        System.out.print(num + " is not a perfect integer"); // print to the screen
        }
    input.close(); // close scanner
    }
    /*
    This method is called isPerfect.
    It is the method that runs the commands necessary to determine wether the user's input is a perfect integer or not.
    */

    public static Boolean isPerfect(int num) {
    int sum = 0;    // declare variable
    for (int factor = 1; factor < num; factor++) { //For loop that keeps running for as long as the integer 'factor' is smaller than the user's number.
    if (num % factor == 0) {  //If statement that adds to the sum if the remainder of the user's number divided by factor is equal to 0.
    sum += factor;
        }
    }

    if (sum == num) {   //If statement that returns true if the calculated sum is equal to the user's number and false otherwise.
        return true;
    } else {
        return false;
    }

    }

}