/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;
import java.lang.String;

public class AccountSetup {
    public static void main(String[] args) {
        String s1, s2;      //Introduces the string variables to the application.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        System.out.print("username: ");   //Prompts the user for their username.
        s1 = input.nextLine();  //Takes the user's input.
        System.out.print("enter a password that is at least 8 characters long: ");   //Prompts the user for their password.
        s2 = input.nextLine();  //Takes user's input.
        int length = s2.length();   //Introduces the length variable, which returns the length of the user's password(s2) when used.
        while (length < 8){     //A while loop that keeps prompting the user for a password for as long as the user's password is less than 8 characters long. It also updates the length of the characters at the end of each loop before it's checked.
            System.out.print("enter a password that is at least 8 characters long: ");
            s2 = input.nextLine();
            length = s2.length();
        }
        System.out.println("username: " + s1.toLowerCase() + " password: " + s2.toLowerCase());
        input.close();
    }
}