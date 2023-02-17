/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

public class SpanishNumbers {
    /*
    It prints out the number 1 to 10 in Spanish using a switch statement.
    */
    public static void Number(int number){
        switch (number){   //A switch statement that prints number from 1 to 10 in Spanish.
        case 1: System.out.println("uno");
        case 2: System.out.println("dos");
        case 3: System.out.println("tres");
        case 4: System.out.println("cuatro");
        case 5: System.out.println("cinco");
        case 6: System.out.println("seis");
        case 7: System.out.println("seite");
        case 8: System.out.println("ocho");
        case 9: System.out.println("nueve");
        case 10: System.out.println("diez");
        }
    }
    /*
    It sets the number for the variable number that the switch statement and the first method rely on for running.
    It also introduces a while loop that makes the switch statement in the first method run through all of it's case.
    */
    public static void main(String[]args){
        int number = 1;
        do{
            Number(number);
            number += 1;
        } while(number < 10);
    }
}