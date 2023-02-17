/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class RemoveStr{
    public static void main(String args[])
    {
        String sentence, word;   //Introduces the string variables to the application.
        Scanner input = new Scanner(System.in);  //Introduces the scanner to the program.
        sentence = input.nextLine();     //Takes user's input.
        word = input.nextLine();
        sentence = sentence.replaceAll(word, "");    //Removes the user's chosen word from the user's initial string by replacing that word with an empty string.
        System.out.print(sentence);  //Prints the user's new string.
        input.close();
    }
}