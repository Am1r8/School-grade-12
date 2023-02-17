/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class MetricConv {
    public static void inchestocentimeters(){   
        Scanner input = new Scanner(System.in);
        double number, centimeters;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        centimeters = number * 2.54;
        System.out.println(number + "inches is " + centimeters + " centimeters");
        input.close();
    }
    public static void feettoCentimeters(){
        Scanner input = new Scanner(System.in);
        double number, centimeters;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        centimeters = number * 30;
        System.out.println(number + "feet is " + centimeters + " centimeters");
        input.close();
    }
    public static void yardstometers(){
        Scanner input = new Scanner(System.in);
        double number, meters;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        meters = number * 0.91;
        System.out.println(number + "yards is " + meters + " meters");
        input.close();
    }
    public static void milestokilometers(){
        Scanner input = new Scanner(System.in);
        double number, kilometers;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        kilometers = number * 1.6;
        System.out.println(number + "meters is " + kilometers + " kilometers");
        input.close();
    }
    public static void centimeterstoinches(){
        Scanner input = new Scanner(System.in);
        double number, inches;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        inches = number / 2.54;
        System.out.println(number + "centimeters is " + inches + " inches");
        input.close();
    }
    public static void centimeterstofeet(){
        Scanner input = new Scanner(System.in);
        double number, feet;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        feet = number / 30;
        System.out.println(number + "centimeters is " + feet + " feet");
        input.close();
    }
    public static void meterstoyards(){
        Scanner input = new Scanner(System.in);
        double number, yards;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        yards = number / 0.91;
        System.out.println(number + "meters is " + yards + " yards");
        input.close();
    }
    public static void kilometerstomiles(){
        Scanner input = new Scanner(System.in);
        double number, miles;
        System.out.println("Please enter a number: ");
        number = input.nextDouble();
        miles = number / 1.6;
        System.out.println(number + "kilometers is " + miles + " miles");
        input.close();
    }
    public static void main(String[]args) {
        double choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Convert:");
        System.out.println("Inches to Centimeters(Enter 1)");
        System.out.println("Feet to Centimeters(Enter 2)");
        System.out.println("Yards to Meters(Enter 3)");
        System.out.println("Miles to Kilometers(Enter 4)");
        System.out.println("Centimeters to Inches(Enter 5)");
        System.out.println("Centimeters to Feet(Enter 6)");
        System.out.println("Meters to Yards(Enter 7)");
        System.out.println("Kilometers to Miles(ENter 8)");
        choice = input.nextDouble();
        if(choice == 1){
            inchestocentimeters();
        }else if(choice == 2){
            feettoCentimeters();
        }else if(choice == 3){
            yardstometers();
        }else if(choice == 4){
            milestokilometers();
        } else if (choice == 5){
            centimeterstoinches();
        } else if (choice == 6){
            centimeterstofeet();
        } else if (choice == 7){
            meterstoyards();
        } else if (choice == 8){
            kilometerstomiles();
        }
        input.close();
    }
}