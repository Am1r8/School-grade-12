/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class Inves
{
    public static void main(String args[]) {
    double interestRate, investmentGoal, investmentValue, interestAmount1, interestAmount2; //Introduces all of my double variables.
    int numOfYears = 0; //Integer variable for the number of years.
    Scanner input = new Scanner(System.in); //Introduces the scanner.
    investmentValue = input.nextInt();
    investmentGoal = input.nextInt();
    interestRate = input.nextInt();
    do {     //A do while loop that calculates the amount of years needed for the user to reach their investment goal.
        interestAmount1 = investmentValue * interestRate;
        interestAmount2 = interestAmount1/100;
        investmentValue += interestAmount2;
        numOfYears++;
    } while (investmentValue < investmentGoal);
    System.out.println(numOfYears);
    input.close();
}}