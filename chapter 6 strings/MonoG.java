/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;
import java.lang.String;

public class MonoG {
    public static void main(String[] args) {
        String name, middleName, lastName;      //Introduces the string variables to the application.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        name = input.nextLine();    //Takes the user's input.
        middleName = input.nextLine();
        lastName = input.nextLine();
        System.out.println(name.substring(0,1).toLowerCase() + middleName.substring(0,1).toUpperCase() + lastName.substring(0,1).toLowerCase());    //Prints out the user's monogram by using substring to take out the first letter of each of their inputs and conveting the first and last to lowercase and the middle one to uppercase using .toLowerCase() and/or .toUpperCase().
        input.close();
    }
}