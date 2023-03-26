import java.util.Scanner;

public class MyMath
{
/**
 * Returns the sum of all integers from 1 to n, if n >= 1,
 * and 0 otherwise.
 */
public static int sumUpTo(int n)
{
    int sum = 0;

    for (int i = 1; i <= n; i++)
    sum += i;

    return sum;
}

/**
 *  Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
 */
public static long factorial(int n)
{
    long f = 1;

    for (int k = 2; k <= n; k++)
    f *= k;

    return f;
}

/**
 *  Returns true if n is a prime; otherwise returns false
 */
public static boolean isPrime(int n)
{

    if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        int m = 3;

        while (m * m <= n){
            if (n % m == 0)
                return false;
            m = m + 2;
        }

        return true;

}


/**
 *  Returns true if n is a perfect number, false otherwise
 */
public static boolean isPerfect(int n)
{

    int sum = 0;

    for (int i = 1; i < n; i++){

        if (n % i == 0){

            sum = sum + i;

        }

    }
    return sum == n;

}

/**
 *  Prints the first n perfect numbers
 */
public static void printPerfectNums(int n)
{
    System.out.println("Perfect numbers: ");
    int i = 2;
    int count = 0;
    while (count < n){
        if (isPerfect(i)){

            System.out.print(i + " ");
            count++;

        }
        i++;
    }
}

/**
 *  Prints the first n Mersenne primes
 */
public static void printMersennePrimes(int n)
{
    System.out.println("Mersenne primes: ");
    int i = 0;
    int p = 2;
    while (i < n){

        p = p * 2;

        if (isPrime(p - 1)){

            System.out.print(p - 1 + " ");
            i++;

        }
    }
}

/**
 *  Prints the first n even perfect numbers
 */
public static void printEvenPerfectNums(int n)
{
    System.out.println("Even perfect numbers: ");
    int p = 2;
    int count = 0;
    while (count < n){

        p = p * 2;

        if (isPrime(p - 1)){

            long c = ((long)p/2)*((long)p-1);

            System.out.print(c + " ");
            count++;

        }
    }

}

/*********************************************************************/

public static void main(String[] args)
{
printPerfectNums(4);
System.out.println("");
printMersennePrimes(6);
System.out.println("");
printEvenPerfectNums(6);

}
}