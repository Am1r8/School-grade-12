/*
Created by Amirhosein Soleimanian
Created on 2022-04-03
Assignemnt by Mr.benum
An application that calculates sin, cos, tan of an angle
*/


import java.util.Scanner;

public class trig {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sine, cosine, tangent;
        double angle = sc.nextDouble();
        sc.nextLine();
        sine = Math.sin(Math.toRadians(angle));
        cosine = Math.cos(Math.toRadians(angle));
        tangent = Math.tan(Math.toRadians(angle));
        sine = (double) Math.round(sine * 100) / 100;
        cosine = (double) Math.round(cosine * 100) / 100;
        tangent = (double) Math.round(tangent * 100) / 100;
        System.out.println(sine);
        System.out.println(cosine);
        System.out.println(tangent);
        sc.close();
    }
}
