package array;

import java.util.Arrays;

public class p7 {
    public static void main (String[] args) {
        // Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element,
        // except for the middle (index 2) element.
        int[] num = new int[] {22, 33, 44, 55, 66};
        for (int i = 0; i < 5; i++) {
            if (i != 2) {
                System.out.println(num[i]);
            }
        }
    }
}
