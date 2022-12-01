package array;

import java.util.*;

public class p11 {
    //Write some Java code that asks the user how many favorite things they have.
    // Based on their answer, you should create a String array of the correct size.
    // Then ask the user to enter the things and store them in the array you created.
    // Finally, print out the contents of the array.Example
    //How many favorite things do you have?   //7 //Enter your thing: phone
    //Enter your thing: tv
    //Enter your thing: xbox
    //Enter your thing: wine
    //Enter your thing: beer
    //Enter your thing: sofa
    //Enter your thing: book
    //Your favorite  things are:
    //phone tv xbox wine beer sofa book
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] mixed = new String[7];
        for (int i = 0; i < mixed.length; i++) {
            System.out.print("Enter your thing: ");
            mixed[i] = s.next();
        }
        System.out.println(Arrays.toString(mixed));
        }
    }