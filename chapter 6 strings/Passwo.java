/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;
import java.lang.String;

public class Passwo {
    public static void main(String[] args) {
        String guess;      //Introduces the string variable to the application.
        final String PASSWORD = "ThisIsThePassword";   //Introduces the string constants to the application.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        guess = input.nextLine();   //Takes the user's input.
        if (guess.equals(PASSWORD)){    //An if/else statement that contains other nested if/else statement and together they check if the user's guess equals the password. If it did it would print (Access Granted), if it didn't it would move on to another prompt for a password and if the password was incorrect again it would move on to one last prompt before denying access after a third failed attempt.
            System.out.println("Access granted.");
        } else{
            guess = input.nextLine();
            if (guess.equals(PASSWORD)){
                System.out.println("Access granted.");
            } else{
                guess = input.nextLine();
                if (guess.equals(PASSWORD)){
                    System.out.println("Access granted.");
                } else{
                    System.out.println("Access denied.");
                }
                
            }
        }
        input.close();
    }
}