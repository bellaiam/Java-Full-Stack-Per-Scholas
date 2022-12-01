package array;

import java.util.Arrays;

public class p8 {
    public static void main (String[] args) {
        // Write a program that creates a String array of
        // 5 elements and swaps the first element with the middle element without creating a new array.
        int[] num = new int[] {22, 33, 44, 55, 66};
        int swap = num [0];
        num[0] = num[2];
        num[2] = swap;
        System.out.println(Arrays.toString(num));
    }
}
