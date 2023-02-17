/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/

import java.util.Scanner;
import java.text.NumberFormat; 
public class MakeChange
 {
     public static void main(String[] args)
     {
         int amount, originalAmount,quarters, dimes, nickels, pennies; // The variables

         Scanner keyboard = new Scanner(System.in); // The scanner object
         amount = keyboard.nextInt(); // The amount of money
 
         originalAmount = amount; // The original amount
         quarters = amount / 25;
         amount = amount % 25;  // The amount of money after quarters
         dimes = amount / 10;
         amount = amount % 10;  // The amount of money after dimes
         nickels = amount / 5;
         amount = amount % 5;  // The amount of money after nickels
         pennies = amount;
 
         System.out.println("Quarters: " + quarters);
         System.out.println("Dimes: " + dimes);  
         System.out.println("Nickels: " + nickels);
         System.out.println("Pennies: " + pennies);
}
}