package PineappleBook;

import java.sql.SQLOutput;
import java.util.Scanner;

public class problem2page349 {
    // Retail Price Calculator
    //Write a program that asks the user to enter an item’s wholesale cost and its markup percentage.
    // It should then display the item’s retail price. For example:
    //•	 If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
    //item’s retail price is 10.00.
    //•	 If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
    //item’s retail price is 7.50.
    //The program should have a method named calculateRetail that receives the wholesale
    //cost and the markup percentage as arguments, and returns the retail price of the item.
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the item the wholesale cost: ");
        double price = s.nextDouble();
        System.out.println("Please enter the item markup percentage: ");
        int percent = s.nextInt();

        calculateRetail(price, percent);
    }

    public static void calculateRetail(double price, int percent) {
        System.out.println("The retail price is " + price * (1 + percent / 100.0));
    }


}
