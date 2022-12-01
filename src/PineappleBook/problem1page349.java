package PineappleBook;

import java.util.*;

public class problem1page349 {
    //showChar Method
    //Write a method named showChar. The method should accept two arguments: a reference to
    //a String object and an integer. The integer argument is a character position within the
    //String, with the first character being at position 0. When the method executes, it should
    //display the character at that character position. Here is an example of a call to the method:
    //showChar("New York", 2);
    //In this call, the method will display the character w because it is in position 2. Demonstrate
    //the method in a complete program.
    public static void main (String[] args) {
        String s;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();

        System.out.print("Enter your index: ");
        int n = sc.nextInt();

        showChar(text, n);
    }
    public static void showChar(String s, int num) {
        System.out.print(s.charAt(num));
    }
}
