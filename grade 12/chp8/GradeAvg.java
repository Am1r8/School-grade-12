import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }

    int score = 0;
	int total = 0;
	double average = 0;
	int numOfScores = 0;

    while (input.hasNextInt()){

    	score = input.nextInt();
    	numOfScores++;
    	total = total + score;

    }

    average = (double)total/numOfScores;
    System.out.println(average);


  }
}