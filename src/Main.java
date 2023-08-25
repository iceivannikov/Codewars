/**
 * Find the sum of the odd numbers within an array, after cubing the initial integers.
 * The function should return undefined/None/nil/NULL if any of the values aren't numbers.
 */

public class Main {
    public static int cubeOdd(int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                result += Math.pow(i, 3);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(cubeOdd(arr));
    }

}
