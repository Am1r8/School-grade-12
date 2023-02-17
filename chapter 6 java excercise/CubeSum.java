/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class CubeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}