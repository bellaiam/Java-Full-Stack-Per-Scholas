package loops;

import java.util.Scanner;

public class GCD {
    public static void main (String[] args) {
        // Write a program that prompts the user to enter two positive integers,
        // and find their greatest common divisor (GCD).
        //Examples:
        //Enter 2 and 4. The gcd is 2.
        //Enter 16 and 24.  The gcd is 8.
        //How do you find the gcd?
        //Name the two input integers n1 and n2.
        //You know number 1 is a common divisor, but it may not be the gcd.
        //Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2,
        // until k is greater than n1 or n2.
        Scanner s = new Scanner(System.in);
        int gcd = 0;
        int k = 2;
        System.out.println("Enter first number: ");
        int n1 = s.nextInt();
        System.out.println("Enter second number: ");
        int n2 = s.nextInt();
        while (k < n1 || k < n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The numbers entered by user are " + n1 + " and " + n2 + " and their GCD is : " + gcd);
        s.close();
    }

}
