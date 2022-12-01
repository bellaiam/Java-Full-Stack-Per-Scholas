package array;

import java.util.Arrays;

public class p3 {
    public static void main(String[] args){
        //Write a program that creates an array of String type and
        // initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
        // Make a copy using the clone( ) method.
        // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
        String [] colors = new String [] {"red", "green", "blue", "yellow"};
        String [] colorsClone = colors.clone();
        System.out.println(colors.length);
        System.out.println(Arrays.toString(colorsClone));
    }

}
