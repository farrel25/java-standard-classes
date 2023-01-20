package farrel.putra.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {45,213,54,523,32,6,9,4,2,7,3,11,43,21,8};
        System.out.println("\n" + numbers);
        System.out.println("before sort: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("\n" + numbers);
        System.out.println("after sort: " + Arrays.toString(numbers));

        System.out.println("\nArrays.binarySearch(numbers, 9). the value 9 is at index: " + Arrays.binarySearch(numbers, 9));
        System.out.println("Arrays.binarySearch(numbers, 12). the value 12 is at index: " + Arrays.binarySearch(numbers, 12));

        int[] numbersCopy1 = Arrays.copyOf(numbers, 5);
        System.out.println("\nArrays.copyOf(numbers, 5): " + Arrays.toString(numbersCopy1));

        int[] numbersCopy2 = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("Arrays.copyOfRange(numbers, 2, 5): " + Arrays.toString(numbersCopy2));
    }
}
