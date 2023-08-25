
/**
 * Given a string made up of letters a, b, and/or c, switch the position of
 * letters a and b (change a to b and vice versa). Leave any incidence of c untouched.
 * Example:
 * 'acb' --> 'bca'
 * 'aabacbaa' --> 'bbabcabb'
 */

public class Main {
    public static String switcheroo(String x) {

        return x.replace("a", "x")
                .replace("b", "y")
                .replace("y", "a")
                .replace("x", "b");
    }

    public static void main(String[] args) {
        String str = "aaabcccbaaa";
        System.out.println(switcheroo(str));
    }

}
