/**
Amirhosein Soleimanian
Grade 11 Computer Science
Mr.Benum
*/

public class House {
    public static void main(String[] args) {
        addRoof();
        addBase();
        addWalk();
    }
    public static void addRoof() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\ ");
        System.out.println("/______\\");
    }
    public static void addBase() {
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
    }
    public static void addWalk() {
        System.out.println("      ");
        System.out.println("   **");
    }
}