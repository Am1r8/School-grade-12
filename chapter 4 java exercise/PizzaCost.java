/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/

import java.util.Scanner;

public class PizzaCost {

     public static void main(String[] args) {
         // Declare variables
         Scanner sc = new Scanner(System.in);
         double size = 0.0;
         double cost = 0.0;
         
         // Display instructions
         size = sc.nextDouble();
         
         // Calculate total cost
         cost = ((.05 * size * size) + 1 + .75);
         // Output the total
         System.out.format("$%.2f",cost);  
     }
}