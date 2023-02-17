/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
        int number;	//The number that the user is going to enter.
        Scanner input = new Scanner(System.in);	//The scanner object.
        number = input.nextInt();
        int hundred1 = number/10;	//The step for getting the tens digit.
        int hundred2 = number/100;	//The variable for the number's hundreds digit.
        int ten = hundred1%10;	//The variable for the number's tens digit.
        int one = number%10;	//The variable for the number's ones digit.
        System.out.println(hundred2);
        System.out.println(ten);
        System.out.println(one);
        
        input.close();

	}

}