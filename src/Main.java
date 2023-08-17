import java.util.HashSet;
import java.util.Set;

public class Main {

    public static final int LETTERS_OF_THE_ALPHABET = 26;

    /**
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
     * the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
     * because it uses the letters A-Z at least once (case is irrelevant).
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
     * Ignore numbers and punctuation.
     */
    public static boolean check(String sentence) {
        Set<Character> set = new HashSet<>();
        String result = getString(sentence);
        char[] chars = result.toLowerCase().toCharArray();
        for (char aChar : chars) {
            if (!Character.isDigit(aChar)) {
                set.add(aChar);
            }
        }
        return set.size() == LETTERS_OF_THE_ALPHABET;
    }

    private static String getString(String sentence) {
        return sentence
                .replace("!", "")
                .replace(".", "")
                .replace(",", "")
                .replace("-", "")
                .replace("_", "")
                .replace(" ", "");
    }

    public static void main(String[] args) {
        String str = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
        System.out.println(check(str));
    }
}