/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt(); 
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        input.close();
    }
    /*
    This is a boolean method that determines if the user's number is prime or not.
    */
    public static boolean isPrime(int number) { 
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}