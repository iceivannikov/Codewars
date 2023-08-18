/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Main {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        String[] split = s.toUpperCase().split("");
        for (String value : split) {
            if (counter > 0) {
                result.append("-");
            }
            result.append(value);
            result.append(value.toLowerCase().repeat(counter));
            counter++;
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String str = "ZpglnRxqenU";
        System.out.println(accum(str));
    }
}