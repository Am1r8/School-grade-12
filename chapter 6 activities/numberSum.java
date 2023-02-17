/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/


import java.util.Scanner;

public class numberSum {
    public static void main(String[] args) {
        int num;  //Introduces the variable num
        int one = 1;    //Introduces the variable one that is equal to the number 1
        Scanner input = new Scanner(System.in);     //Introduces the Scanner
        System.out.print("Please enter a number: ");    //Prompts the user for a number
        num = input.nextInt();      //Takes the user's input
        while (one <= num){    //A while loop that displays the numbers between 1 and the user's number by adding 1 to 1 until it reaches the user's number.
            System.out.println(one);
            one++;
        }
        System.out.print("Sum: "); 
        int sum1 = num/2;   //Step one of calculating the sum of the consecutive numbers before the user's number (Including the user's number)
        int sum2 = 1 + num;     //Step two of calculating the sum of the consecutive numbers before the user's number (Including the user's number)
        int sum3 = sum1 + sum2;     //Step three of calculating the sum of the consecutive numbers before the user's number (Including the user's number)
        System.out.print(sum3);     //Displays the sum of the consecutive numbers before the user's number (Including the user's number)
        input.close();
    }
}