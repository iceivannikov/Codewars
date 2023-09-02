import java.util.function.IntPredicate;

/**
 * Create a method all which takes two params:
 * a sequence
 * a function (function pointer in C)
 * and returns true if the function in the params returns true for every element in the sequence.
 * Otherwise, it should return false. If the sequence is empty, it should return true, since technically
 * nothing failed the test.
 * Example
 * all((1, 2, 3, 4, 5), greater_than_9) -> false
 * all((1, 2, 3, 4, 5), less_than_9)    -> True
 */

public class Main {
    public static boolean all(int[] list, IntPredicate predicate){
        if (list.length == 0) {
            return true;
        }
        int count = 0;
        for (int i : list) {
            if (predicate.test(i)) {
                count++;
            }
        }
        return count == list.length;
    }


    public static void main(String[] args) {
        IntPredicate evenNumber = n -> n % 2 == 0;
        int[] arr = {2, 4, 6, 10};
        System.out.println(all(arr, evenNumber));
    }

}
