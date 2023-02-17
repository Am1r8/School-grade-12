/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that calculates the monthly payment of a loan 
*/


import java.util.Scanner;
import java.lang.Math;

public class carPayment {
  public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double r = input.nextDouble();
        double m = input.nextDouble();
        double stepOne = r/12;
        double stepTwo = stepOne * p;
        double stepThree = stepOne + 1;
        double stepFour = Math.pow(stepThree, -m);
        double stepFive = 1 - stepFour;
        double stepSix = stepTwo/stepFive;
        System.out.printf("%.2f", stepSix);
        input.close();
    }
}
