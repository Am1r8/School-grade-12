/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/


import java.util.Scanner;

public class Ppassing {
    public static void main(String[] args) {
    final int stop = 999;   //Introduces the constant stop with the value of 999 (The value required to stop taking input)
    int score;      //Introduces the variable score (User's input)
    int num = 0;    //Introduces the variable num (The number of inputs)
    int percentage = 0;     //Introduces the variable percentage
    double avg;     //Introduces the variable avg
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your score: (enter 999 to stop entering scores)");   //Prompts the user for their score
    score = input.nextInt();    //Takes the user's input
    while(score != stop){   //A while loop that keeps prompting the user for their score for as long as they enter a number other than the value for the constant 'stop'
        num+=1;     //Adds to the number of inputs each time the user enters a score
        if(score >= 70){    //If statement that adds one value to the percentage variable each time the user's score is above %70
            percentage+=1;
        }
        System.out.println("Please enter your score: (enter 999 to stop entering scores)");
        score = input.nextInt();
    }
    input.close();
    avg = (double)percentage/(double)num;   //Calculates the percentage of the user's marks that were above %70 using the user's number of inputs and percentages
    System.out.println("%" + avg + " Of your scores are above %70");  //Displays the user's average
    }
}