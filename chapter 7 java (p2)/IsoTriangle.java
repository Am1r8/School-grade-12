/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.*;

public class IsoTriangle
{
    public static void main(String args[]) {
    int size; // declare variable
    Scanner input = new Scanner(System.in); // declare scanner
    System.out.println("Enter the size: "); // prompt user for input
    size = input.nextInt(); // assign input to variable
    for(int i = 1;i <= size;i++) { // for loop that prints the triangle
            for(int j = i;j <= size;j++) { // for loop that prints the triangle
                addSpaces(); // call method
            }
            for(int j = 1;j <= i;j++) { // for loop that prints the triangle
                drawBar();     //Calls for the drawBar method.
            }
            System.out.println(""); // prints a new line
        }
    input.close(); // close scanner
    }
    /*
    This method is called drawBar and it prints a '* ' to the screen when called for.
    */
    public static void drawBar() { 
    System.out.print("* "); // prints a '* ' to the screen
    }
    /*
    This method is called addSpaces and it prints a space to the screen when called for.
    */
    public static void addSpaces() { 
        System.out.print(" "); // prints a space to the screen
    }
}