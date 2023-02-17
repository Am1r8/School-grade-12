/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.*;

public class HiLo { 
    public static void main(String[] args) {
        int number; // declare variable
        String guess; // declare variable
        Scanner input = new Scanner(System.in); // declare scanner
        Random r = new Random(); // declare random
        number = r.nextInt((13 - 1) + 1) + 1; // generate random number
        System.out.print("Please enter your guess for whether the number is Hi(8-13) or Lo(1-6): "); // prompt user for input
        guess = input.nextLine(); // assign input to variable
        getResult(number, guess);   //Calls for the getResult method with 'number and guess' as it's parameters.
        input.close(); // close scanner
    }
    
    /*
    This method is called getResult.
    It uses the correct calculations to get the result for the user's guess and determine whether it is right or wrong.
    */
    
    public static void getResult(int number, String guess){
        
        if (number >= 1 && number <= 6 && guess.equals("Lo") || number >= 8 && number <= 13 && guess.equals("Hi")){  //An if statement that prints 1 if the user's input is 'Lo' and between 1-6 or 'Hi' and between 8-13. 
            
            System.out.print("1");
            
        } else if (number == 7){     //An else if statement that prints 0 if the random number is 7.
            
            System.out.print("0");
            
        } else { //An else statement that prints -1 if none of the conditions above were met.
            
            System.out.print("-1");
            
        }
        
    }
}