/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class GAssign {
    public static void main(String [] args) {
        String lastName;  //Introduces the string variablt to my program.
        Scanner input = new Scanner(System.in);   //Introduces the scanner.
        lastName = input.nextLine();  //Takes the user's input.
        if ('A' <= lastName.charAt(0) && lastName.charAt(0) <= 'I') {     //An if statement that assignsthe user to group 1 if their last name starts with a letter between A and I inclusive.
            System.out.println("Group 1");
        } else if ('J' <= lastName.charAt(0) && lastName.charAt(0) <= 'S') {  //An else if statement that assignsthe user to group 2 if their last name starts with a letter between J and S inclusive.
            System.out.println("Group 2");
        } else {      //An else statement that assigns the user to group 3 if their name starts with anything else.
            System.out.println("Group 3");
        }
        input.close();
    }
}