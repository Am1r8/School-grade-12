/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class TimeConverter {
    /*
    This method is responsible for converting hours to minutes.
    */
    public static void hourstominutes(){   
        int hours, minutes;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of hours: ");
        hours = input.nextInt();
        input.close();
        
        minutes = hours * 60;  //Formula for converting hours to minutes.
        
        System.out.println("Your input converted to minutes is: " + minutes + " minutes.");
        
    }
    /*
    It is responsible for converting days to hours.
    */
    public static void daystohours(){
        int hours, days;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of days: ");
        days = input.nextInt();
        input.close();
        hours = days * 24;     //Formula for converting days to hours.
        System.out.println("Your input converted to hours is: " + days + " days");
        
    }
    /*
    It is responsible for converting minutes to hours.
    */
    public static void minutestohours(){
        int hours, minutes;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of minutes: ");
        minutes = input.nextInt();
        input.close();
        hours = minutes / 60;  //Step one of converting minutes to hours.
        int hours2 = minutes % 60;   //Step two of converting minutes to hours. This is the remainder.
        System.out.println("Your input converted to hours is: " + hours2 + " hours");
    }
    /*
    It is responsible for converting hours to days.
    */
    public static void hourstodays(){
        int hours, days;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of hours: ");
        hours = input.nextInt();
        input.close();
        days = hours / 24; //Formula for converting hours to days.
        System.out.println("Your input converted to hours is: " + hours + " hours");
        
    }
    /*
    This method is responsible for giving the user the choice to choose what type of conversion they want to do.
    */
    public static void main(String[]args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for hours to minutes");
        System.out.println("Enter 2 for days to hours");
        System.out.println("Enter 3 for minutes to hours");
        System.out.println("Enter 4 for hours to days");
        choice = input.nextInt();
        if(choice == 1){
            hourstominutes();
        }else if(choice == 2){
            daystohours();
        }else if(choice == 3){
            minutestohours();
        }else {
            hourstodays();
        }
        input.close();
    }
}