import java.util.Objects;
import java.util.stream.Stream;

/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.
 * For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 * Example:
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * Note that the Java version expects a return value of null for an empty string or null.
 */

public class Main {
    public static String toJadenCase(String phrase) {
        if (Objects.isNull(phrase) || phrase.length() == 0) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        String[] strings = phrase.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            String substring1 = string.substring(0, 1).toUpperCase();
            String substring = string.substring(1);
            String join = String.join("", substring1, substring);
            builder.append(join);
            if (i != strings.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String str = "How can mirrors be real if our eyes aren't real";
        System.out.println(toJadenCase(str));
    }

}
