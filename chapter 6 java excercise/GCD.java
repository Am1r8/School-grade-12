/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int num1, num2, gcd = 1;    //Introduces my integer variables.
        Scanner input = new Scanner(System.in);     //Introduces my Scanner.
        num1 = input.nextInt();     //Takes user input for num1.
        num2 = input.nextInt();     //Takes user input for num2.
        for(int i = 1; i <= num1 && i <= num2; i++) {    //A for loop that keeps adding to the greatest common denominator for as long as the two inputs are equal or greater than it.
            if(num1%i == 0 && num2%i == 0)      //An if statement that declares i equal to gcd for as long as the remainder of the two inputs are equal to 0.
                gcd = i;
        }
        System.out.print(gcd);
        input.close();
    }
}