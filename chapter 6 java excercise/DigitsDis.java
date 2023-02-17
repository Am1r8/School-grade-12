/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class DigitsDis
{
    public static void main(String args[]) {
        int num, temp, digit;   //Introduces my integer variables.
        Scanner input = new Scanner(System.in);
        num = input.nextInt();    //Takes user input.
        temp = num;
        while(num > 0) { //A while loop that divides the user's input by 10 for as long as the number is above 0.
            num = num / 10;
        }
        while(temp > 0) {   //A second while loop that gets the remainder of the number divided by 10, outputs it and then divides the number by 10 for as long as the number is bigger than 0.
            digit = temp % 10;
            System.out.println(digit);
            temp = temp / 10;
        }
        input.close();
    }
}