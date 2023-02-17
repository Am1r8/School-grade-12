/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;
import java.lang.String;

public class FormalGree {
    public static void main(String[] args) {
        String name;      //Introduces the string variable to the application.
        final String MISS = "Miss", MRS = "Mrs.", MS = "Ms.", MR = "Mr.";   //Introduces the string constants to the application.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        name = input.nextLine();  //Takes the user's input.
        if (name.substring(0,4).equals(MISS) || name.substring(0,4).equals(MRS) || name.substring(0,3).equals(MS)){     //An if statement that checks for the strings (Miss, Mrs. or Ms.) and if any of them were present, it would print out "Hello, ma'am".
            System.out.println("Hello, ma'am");
        } else if (name.substring(0,3).equals(MR)){     //An else if statement that checks for the string (Mr.) and if it was present, it would print out "Hello, sir".
            System.out.println("Hello, sir");
        } else {    //An else statement that prints out "Hello" with the user's entered name next to it if none of the above conditions were true.
            System.out.println("Hello " + name);
        }
        input.close();
    }
}