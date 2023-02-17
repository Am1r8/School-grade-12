/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
Quadratic equation
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class quadratic {
  public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double result = b * b - 4.0 * a * c;
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println(df.format(r1));
            System.out.println(df.format(r2));
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println(r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        input.close();
    }
}
