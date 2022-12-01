package array;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        //Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int [] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        System.out.println( Arrays.toString(num));
    }
}
