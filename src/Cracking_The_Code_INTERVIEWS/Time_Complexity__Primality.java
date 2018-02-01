package Cracking_The_Code_INTERVIEWS;

/**
 * Created by _kbluue_ on 1/29/2018.
 *
 * check https://www.hackerrank.com/challenges/ctci-big-o/problem for full question
 */
public class Time_Complexity__Primality {

    private static boolean isPrime(int number){
        if (number < 1) return false; //Negative numbers are not prime numbers

        if (number < 4) return true; //Numbers 1 to 3 are prime numbers. Besides my method will not cover for them

        /*
         Consider the equation:
                    2 * x = number
            the variable 'number' can never be divisible by any value greater than x, therefore
                    'stopPoint'
            dynamically excludes these set of number thereby greatly reducing the time complexity of these operation.
         */
        int stopPoint = number;
        for (int i = 2; i < stopPoint + 1; i++) {
            if (number%i == 0) return false;
            stopPoint = number / i;
        }
        return true;
    }

    /*
    Prints all the prime numbers between 1 and the given range
     */
    public static void printAllPrime(int range){
        int count = 0;
        String out = "\n";
        for (int i = 0; i < range + 1; i++) {
            if (isPrime(i)) {
                out += (i + "\n");
                count++;
            }
        }
        System.out.printf("There are %d Prime Numbers between 1 and %s and they are:%s", count, range, out);
    }

    public static void run(int number){
        System.out.println(isPrime(number) ? "Prime" : "Not prime");
    }
}

