/* Date: 2022-03-23
* Class: ICS3U
* Teacher: Mr. Benum
* By: Amirhosein Soleimanian
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class ObjectHeight {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);  //The scanner object.
    double time;  //The number for time.
    double height;  //The variable for the height.

    time = input.nextDouble();  //The user enters the time.
    height = 100-4.9*(time*time);  //The equation for the height.
    NumberFormat decimal = NumberFormat.getNumberInstance();  
    decimal.setMaximumFractionDigits(1);  //The maximum fraction digits
    System.out.println(decimal.format(height));
    }
}