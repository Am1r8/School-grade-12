/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
    int [] randomNum = new int[500]; // array length
    int Q=0, W=0, E=0, R=0, T=0, Y=0, U=0, O=0; // variables
    int A=0; // variables
    Random rand = new Random(); // random number generator
    for (int i=0; i<randomNum.length; i++) {
        randomNum[i] = rand.nextInt(10); // generate random numbers from 0 to 9
        if (randomNum[i]==1) { // if 1
            Q++; // add 1
        }
        else if (randomNum[i]==2) { // if 2
            W++; // add 1
        } else if (randomNum[i]==3) { // if 3
            E++; // add 1
        } else if (randomNum[i]==4) { // if 4
            R++; // add 1
        } else if (randomNum[i]==5) { // if 5
            T++; // add 1
        } else if (randomNum[i]==6) { // if 6
            Y++; // add 1
        } else if (randomNum[i]==7) { // if 7
            U++; // add 1
        } else if (randomNum[i]==8) { // if 8
            A++; // add 1
        } else if (randomNum[i]==9) { // if 9
            O++; // add 1
        }
    }
    System.out.println("1: " + Q); // print number of ones
    System.out.println("2: " + W); // print number of twos
    System.out.println("3: " + E); // print number of threes
    System.out.println("4: " + R); // print number of fours
    System.out.println("5: " + T); // print number of fives
    System.out.println("6: " + Y); // print number of sixes
    System.out.println("7: " + U); // print number of sevens
    System.out.println("8: " + A); // print number of eights
    System.out.println("9: " + O); // print number of nines
    }
}