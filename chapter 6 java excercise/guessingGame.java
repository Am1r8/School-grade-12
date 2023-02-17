/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main(String[] args) {
        int number, guess;  //Introduces the integer variables.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        long seed = input.nextLong();   //Takes user input for seed.
        Random r = new Random(seed);    //Generates a random number based on the seed.
        do {     //A do while loop that keeps prompting the user for their guess until they guess the number correctly or enter 0 to exit.
            System.out.print("Please enter a guess for the number (0 to exit): ");
            guess = input.nextInt();
            number = r.nextInt(10)+1;
            if(guess == number) {
                System.out.println("WINNER");
            } else {
                System.out.println("LOSER");
            }
        } while(guess != number && guess != 0);
		input.close();
    }
}