import java.util.Scanner;

public class Dates
{
  /**
   *  returns true if month1/day1/year1 is later than
   *  month2/day2/year2; otherwise returns false
   */
  public static boolean isLater(int month1, int day1, int year1,
                                int month2, int day2, int year2)
  {
    // Check if year1 is later than year2
    if ((year1 > year2))
    {
      return true;
    }
    // Check if year1 and month1 are later than year2 and month2
    else if ((year1==year2 && month1>month2))
    {
      return true;
    }
    // Check if year1, month1, and day1 are later than year2, month2, and day2
    else if (year1==year2 && month1==month2 && day1>day2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    // Get the first date from the user
    System.out.print("Enter the first date  (month day year): ");
    int month1 = kb.nextInt();
    int day1 = kb.nextInt();
    int year1 = kb.nextInt();

    // Get the second date from the user
    System.out.print("Enter the second date (month day year): ");
    int month2 = kb.nextInt();
    int day2 = kb.nextInt();
    int year2 = kb.nextInt();

    System.out.println();  // blank line

    // Check which date is later
    String msg = month1 + "/" + day1 + "/" + year1;
    if (isLater(month1, day1, year1, month2, day2, year2))
      msg += " IS ";
    else
      msg += " is NOT ";
    msg += "later than " + month2 + "/" + day2 + "/" + year2;
    System.out.println(msg);
  }
}
