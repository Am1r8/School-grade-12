/**
 *
 Chapter 3 - Exercise 1 - BingoCard
ICS3U
Mr. Benum
Amirhosein Soleimanian
*/


// code will display a bingo card

class Main {
    public static void main(String[] args) {
    
        System.out.format("%4s %4s %4s %4s %4s","B","I","N","G","O");
        //This code displays each letter of "BINGO" spaced out and formated
        //using the format function, to set up each column of numbers for the card. All the %[alignment][width]s are set up as the same to have the same amount of space between each letter.
        
        System.out.format("\n %3s %4s %4s %4s %4s","2","20","42","60","64");
        //This code displays each number of the card, spaced out and formated
        System.out.format("\n%4s %4s %4s %4s %4s","14","15","32","55","70");
        System.out.format("\n%4s %4s %5s %3s %4s","5","18","FREE","53","67");        
        System.out.format("\n%4s %4s %4s %4s %4s","12","16","31","46","75");
        
        System.out.format("\n%4s %4s %4s %4s %4s","10","22","39","59","71");
      }
    }