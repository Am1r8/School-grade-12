/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application just like a calculator but it's called math tutor lol
*/

import java.util.Scanner;
import java.util.Random;

public class mathTutor {
	public static void main(String[] args) {
        double answer;
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random r = new Random(seed);
		int firstNum = r.nextInt(100);
		int secondNum = r.nextInt(100);
        String strOperator = input.next();
        char operator = strOperator.charAt(0);
        if(operator == '+'){
            answer = firstNum + secondNum;
            System.out.println(firstNum + "+" + secondNum + "=" + (int) answer);
        } else if(operator == '-'){
            answer = firstNum - secondNum;
            System.out.println(firstNum + "-" + secondNum + "=" + (int)answer);
        } else if(operator == '/'){
            answer = firstNum / secondNum;
            System.out.println(firstNum + "/" + secondNum + "=" + (int)answer);
        } else if(operator == '*'){
            answer = firstNum * secondNum;
            System.out.println(firstNum + "*" + secondNum + "=" + (int)answer);
        }
        input.close();
	}
}
