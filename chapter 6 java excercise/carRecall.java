/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/
import java.util.Scanner;

public class carRecall {
    public static void main(String[] args) {
        int modelOfCar;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Please enter your car's model (0 to exit): ");
            modelOfCar = input.nextInt();
            if(modelOfCar == 119 || modelOfCar == 179 || modelOfCar >= 189 || modelOfCar <= 198 || modelOfCar >= 221 || modelOfCar >= 780 || modelOfCar != 0) {
                System.out.println("Not Safe");
            } else if(modelOfCar != 0) {
                System.out.println("Safe");
            }
        } while (modelOfCar != 0);
		input.close();
    }
}