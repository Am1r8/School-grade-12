/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;
public class CountVowels{
public static void main(String args[]){
    int vowelCount = 0;   //Introduces the vowelCount variable to my program.
    String sentence;  //Introduces the sentence string to my program.
    Scanner input = new Scanner(System.in);   //Introduces the scanner to my program.
    sentence = input.nextLine();  //Takes the user's input and assigns it to the sentence variable.
    for (int i = 0 ; i < sentence.length(); i++){     //A for loop that keeps going until i is bigger than the length of the user's input.
    char ch = sentence.charAt(i);
    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){      //An if statement that adds to the vowel count if any of the characters stated are present in the user's input.
    vowelCount ++;
    }}
    System.out.println(vowelCount);
    input.close();
}
}