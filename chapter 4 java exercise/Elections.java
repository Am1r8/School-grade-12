/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Elections {

	public static void main(String[] args) {
		int v1;	//Votes for the first candidate.
		int v2;	//Votes for the second candidate.
		int v3;	//Votes for the third candidate.
		String canOne;	//Name of the first candidate.
		String canTwo;	//Name of the second candidate.
		String canThree;	//Name of the third candidate.
		Scanner input = new Scanner(System.in);	//The scanner object.
		DecimalFormat df = new DecimalFormat("0.00");	//Decimal formatting.
		
		System.out.print("Please enter the name of the first candidate: ");
		canOne = input.nextLine();
		System.out.print("Please enter the name of the second candidate: ");
		canTwo = input.nextLine();
		System.out.print("Please enter the name of the third candidate: ");
		canThree = input.nextLine();
		System.out.print("Please enter the number of votes for the first candidate: ");
		v1 = input.nextInt();
		System.out.print("Please enter the number of votes for the second candidate: ");
		v2 = input.nextInt();
		System.out.print("Please enter the number of votes for the third candidate: ");
		v3 = input.nextInt();
		
		double sum = v1 + v2 + v3;	//Total votes.
		double perOne1 = v1/sum;	//Step one of calculating the percentage of votes for the first candidate.
		double perOne2 = perOne1 * 100;	//Step two of calculating the percentage of votes for the first candidate.
		double perTwo1 = v2/sum;	//Step one of calculating the percentage of votes for the second candidate.
		double perTwo2 = perTwo1 * 100;	//Step two of calculating the percentage of votes for the second candidate.
		double perThree1 = v3/sum;	//Step one of calculating the percentage of votes for the third candidate.
		double perThree2 = perThree1 * 100;	//Step two of calculating the percentage of votes for the third candidate.
		
		System.out.println("\n");
		System.out.format("%-20s%18s%18s","Candidate","Votes","Percentage");
		System.out.println("\n");
		System.out.format("%-20s%18s%18s",canOne,v1,df.format(perOne2));
		System.out.println("\n");
		System.out.format("%-20s%18s%18s",canTwo,v2,df.format(perTwo2));
		System.out.println("\n");
		System.out.format("%-20s%18s%18s",canThree,v3,df.format(perThree2));
		System.out.println("\n\nTotal votes: " + sum);
		
		input.close();
	}

}