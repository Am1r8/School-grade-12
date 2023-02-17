/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
        int minutes;	//The number for minutes.
        Scanner input = new Scanner(System.in);	//The scanner object.
        
        minutes = input.nextInt();
        final int hours = minutes/60;	//The variable for the hours.
        final int minutes2 = minutes%60;	//The variable for the minutes left.
        System.out.println( + hours + ":" + minutes2);
        
        input.close();
	}
}