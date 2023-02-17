/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that calculates exponent and power with math.pow formula
*/

import java.util.Scanner;
import java.lang.Math;

public class myPow {
  public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double y = input.nextInt();
        double logarithm = Math.log(x);
        double multiplication = y * logarithm;
        double exponent = Math.exp(multiplication);
        double power = Math.pow(x,y);
        System.out.println(exponent);
        System.out.println(power);
        input.close();
  }
}
