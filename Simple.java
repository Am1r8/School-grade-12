// // import java.util.*;

// // public class Simple{  
// //     public static void main(String[] args) {

// //         //Odd Numbers
// //         int[] randomNumbers = new int[25];
// //         int[] evenNumbers = new int[25];
// //         int[] oddNumbers = new int[25];
// //         ArrayList<String> odd = new ArrayList<String>();  
// //         ArrayList<String> even = new ArrayList<String>();
// //         int k = 0, l = 0;
// //         for (int index = 0; index < randomNumbers.length; index++) {
// //             randomNumbers[index] = (int) (Math.random() * 99);
// //         }
// //         for (int i = 0; i < 25; i++) {
// //             if (randomNumbers[i] % 2 == 0) {
// //                 evenNumbers[k] = randomNumbers[i];
// //                 if (evenNumbers[k] != 0) {
// //                     String str = Integer.toString(evenNumbers[k]);
// //                     odd.add(str);
// //                 }
// //                 k++;
// //             } else {
// //                 oddNumbers[l] = randomNumbers[i];
// //                 if (oddNumbers[l] != 0) {
// //                     String str = Integer.toString(oddNumbers[l]);
// //                     even.add(str);
// //                 }
// //                 l++;
// //             }
// //         }
// //         System.out.println("Odd: \n" + String.join(", ", odd));
// //         System.out.println("Even: \n" + String.join(", ", even));
// //     }
// // }

// // import java.util.Scanner; 
// // import java.util.Random;
// // public class Simple {
// //     public static void main(String[] args) {
// //     int [] randomNum = new int[500]; 
// //     int Q=0, W=0, E=0, R=0, T=0, Y=0, U=0, O=0; 
// //     int A=0;
// //     Random rand = new Random();
// //     for (int i=0; i<randomNum.length; i++) {
// //         randomNum[i] = rand.nextInt(10);
// //         System.out.println(randomNum[i]);  
// //         if (randomNum[i]==1) {
// //             Q++;
// //         }
// //         else if (randomNum[i]==2) {
// //         W++;
// //         } else if (randomNum[i]==3) {
// //         E++;
// //         } else if (randomNum[i]==4) {
// //         R++;
// //         } else if (randomNum[i]==5) {
// //         T++;
// //         } else if (randomNum[i]==6) {
// //         Y++;
// //         } else if (randomNum[i]==7) {
// //         U++;
// //         } else if (randomNum[i]==8) {
// //         A++;
// //         } else if (randomNum[i]==9) {
// //         O++;
// //         }
// //     }
// //     System.out.println("1: " + Q);
// //     System.out.println("2: " + W);
// //     System.out.println("3: " + E);
// //     System.out.println("4: " + R);
// //     System.out.println("5: " + T);
// //     System.out.println("6: " + Y);
// //     System.out.println("7: " + U);
// //     System.out.println("8: " + A);
// //     System.out.println("9: " + O);
// //     }
// // }

// import java.util.*; 
// // import java.util.Random;
// public class Simple {
//     public static void main(String[] args) {
//         System.out.println("Index" + "\t" + "Generated Number");
//         int [] randomNum = new int[101];
//         int sumj = 0;
//         for (int i = 0; i < randomNum.length; i++) {
//             String number = String.valueOf(i);
//             if (i < 10){
//                 number = "0" + number;
//             }
//             // System.out.println(number);
//             for(int k = 0; k < number.length(); k++) {
//                 int j = Character.digit(number.charAt(k),10);
//                 sumj = sumj + j;
//             }
//             randomNum[i] = i + sumj;
//             System.out.println(i + "\t" + randomNum[i]);
//             sumj = 0;
//         }
//     }
// }