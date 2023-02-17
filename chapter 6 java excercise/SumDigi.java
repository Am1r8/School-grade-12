/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class SumDigi {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1 billion: ");
        int n = in.nextInt();
        while (!(n > 0 && n < 1000)) {
            n = in.nextInt();
        }
        int sum = 0, temp = 0;
        while (n != 0)
        {
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println("The sum of all digits is: " + sum);
        in.close();
    }
}