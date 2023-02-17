/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class PrimeNum
{
    public static void main(String args[]) {
    int primeCheck;     //Integer variable for checking the numbers. 
    boolean prime = true;      //Boolean that confirms whether or not a number is prime. 
    Scanner input = new Scanner(System.in);     //Introduces the scanner.
    int num = input.nextInt();  //Assigns the input to the variable num (Integer).
    input.close();
    if(num <= 1000000){     //First if statement that checks whether or not the input is supported.
        for(int i = 2;i <= num/2;i++) {  //For loop that checks if the input is a prime number.
            primeCheck = num%i;
            if(primeCheck == 0) {
                prime = false;
            }
        }
        if(prime) {  //Output for when the number is prime.
            System.out.println("YES");
        } else {     //Output for when the number is not prime.
            System.out.println("NO");
        }
    } else if(num > 1000000) {  //Related to the first if statement. Gives an error if the user's input is not supported.
        System.out.println("Please enter a number lower than 1 Million.");
    }
}
}