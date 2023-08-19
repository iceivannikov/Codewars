import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a simple regex to validate a username. Allowed characters a
 * lowercase lette
 * numbe
 * undersc
 * Length should be between 4 and 16 characters (both included).
 */

public class Main {

    public static boolean validateUsr(String s) {
        String regex = "[a-z0-9_]{4,16}+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }


    public static void main(String[] args) {
        String str = "a";
        System.out.println(validateUsr(str));
    }
}