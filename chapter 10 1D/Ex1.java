/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

import java.util.*;

public class Ex1{  
    public static void main(String[] args) {
        int[] randomNumbers = new int[25]; //arrays length
        int[] evenNumbers = new int[25]; //arrays length
        int[] oddNumbers = new int[25]; //arrays length
        ArrayList<String> odd = new ArrayList<String>();  
        ArrayList<String> even = new ArrayList<String>();
        int k = 0, l = 0; //variables
        for (int index = 0; index < randomNumbers.length; index++) {
            randomNumbers[index] = (int) (Math.random() * 99); //generate random numbers
        }
        for (int i = 0; i < 25; i++) { // for loop
            if (randomNumbers[i] % 2 == 0) { // if even
                evenNumbers[k] = randomNumbers[i];
                if (evenNumbers[k] != 0) {
                    String str = Integer.toString(evenNumbers[k]); // integer to string
                    odd.add(str); // add to array list
                }
                k++;
            } else { // if odd
                oddNumbers[l] = randomNumbers[i];
                if (oddNumbers[l] != 0) {
                    String str = Integer.toString(oddNumbers[l]); // integer to string
                    even.add(str); // add to array list
                }
                l++;
            }
        }
        System.out.println("Odd: \n" + String.join(", ", odd)); // print array list
        System.out.println("Even: \n" + String.join(", ", even)); // print array list
    }
}