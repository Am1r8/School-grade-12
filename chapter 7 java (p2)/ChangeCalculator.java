/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        int quarters, dimes, nickels, pennies; //declare variables
        Scanner input = new Scanner(System.in); //declare scanner
        System.out.print("Please enter the amount of quarters: "); //prompt user for input
        quarters = input.nextInt(); //assign input to variable
        System.out.print("Please enter the amount of dimes: "); //prompt user for input
        dimes = input.nextInt(); // assign input to variable
        System.out.print("Please enter the amount of nickels: "); //prompt user for input
        nickels = input.nextInt(); // assign input to variable
        System.out.print("Please enter the amount of pennies: "); //prompt user for input
        pennies = input.nextInt(); // assign input to variable
        getCents(quarters, dimes, nickels, pennies); //Calls for the getCents method with 'quarters, dimes, nickles and pennies' as it's parameters.
        input.close(); //close scanner
    }
    
    /*
    This method is called getCents.
    It uses a formula that converts all of the user's different inputs into cents and adds them all together.
    */
    public static void getCents(int quarters, int dimes, int nickles, int pennies) { // this method is called getCents and takes in the user's inputs and turns them into cents and prints it to the screen
        int cents = quarters * 25 + dimes * 10 + nickles * 5 + pennies; // formula to convert all of the user's inputs into cents
        System.out.print("You have " + cents + " cents"); // print the amount of cents to the screen
    }

}