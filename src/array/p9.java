package array;

import java.util.Arrays;

public class p9 {
    //Write a program to sort the following int array in ascending order:
    // {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
    // and print the smallest and the largest element of the array. The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13
    public static void main (String[] args) {
        int[] num = new int[] {4, 2, 9, 13, 1, 0};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num) + "\n" + num[0] + "\n" + num[num.length - 1]);

    }
}
