/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that checks the level of grade
*/

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		int mark;
		Scanner input = new Scanner(System.in);
		mark = input.nextInt();
		if(mark >= 80 && mark <= 100) {
			System.out.println("Level 4");
		} else if(mark >= 70 && mark <=79) {
			System.out.println("Level 3");
		} else if(mark >= 60 && mark <= 69) {
            System.out.println("Level 2");
        } else if(mark >= 50 && mark <= 59) {
            System.out.println("Level 1");
        } else if(mark < 50) {
        System.out.println("Level R");          
        }
		input.close();
	}
}

