/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.Scanner;

public class DBP2 {
    /*
    This method is used for drawing the actual box using a loop.
    */
    public static void box (int length, int width, String character){ 
        Scanner input = new Scanner (System.in);
        for (int i = 0; i < length; i++) {  //A for loop that keeps running and printing characters until the values reach the entered length and width to draw a box.
                for (int j = 0; j < width; j++) {
                    System.out.print(character + "");
                }
                System.out.println("");
        }
        input.close();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);  
        int length, width;
        String answer;
        String character = "*";
        System.out.println("Do you want to use a special character to use to display the box ?"); 
            answer = input.next();
        if (answer.equals("Yes")){
            System.out.println("Please enter the character that you would like to display the box");
            character =  input.next();
        }
        if (answer == "No"){
            character = "*";
        }
        System.out.println ("Please enter the length of the box"); 
        length = input.nextInt();
        System.out.println (" Please enter the width of the box");
        width = input.nextInt(); 
        input.close();
        box (length, width, character);
    }
}