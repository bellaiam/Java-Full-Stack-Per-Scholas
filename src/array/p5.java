package array;

import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        // Write a program where you create an integer array with a length of 5. Loop through the array
        // and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = i;
        }
        System.out.println(Arrays.toString(num));
     }
}
