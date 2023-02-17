/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Index" + "\t" + "Generated Number"); // print
        int [] randomNum = new int[101]; // array length
        int sumj = 0; // variable
        for (int i = 0; i < randomNum.length; i++) {
            String number = String.valueOf(i); // convert int to string
            if (i < 10){ // if less than 10
                number = "0" + number; // add 0 to the first of string
            }
            for(int k = 0; k < number.length(); k++) {
                int j = Character.digit(number.charAt(k),10); // separate each digit of number
                sumj = sumj + j; // add to sum
            }
            randomNum[i] = i + sumj; // add to array
            System.out.println(i + "\t" + randomNum[i]); // print
            sumj = 0; // reset the variable
        }
    }
}