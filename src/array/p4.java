package array;

public class p4 {
    public static void main(String[] args){
        //Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and the last index
        // using length - 1 as the index. Now try printing the value at index = length
        // ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced.
        // Now try to assign a value to the array index 5.
        // You should get the same type of exception.
        int[] numbers = new int[] {52, 24, 95, 45, 6};
        System.out.println(numbers[0] + "\n" + numbers[4]);
        // numbers[5] = 23; arrayIndexOutOfBoundsException
    }
}
