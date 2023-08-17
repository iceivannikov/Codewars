import java.util.Arrays;

public class Main {

    /**
     * Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below.
     * Index 0 will be considered even.
     * For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
     * The input will be a lowercase string with no spaces
     * Good luck!
     */
    public static String[] capitalize(String s){
        StringBuilder even = new StringBuilder();
        StringBuilder noEven = new StringBuilder();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                even.append(split[i].toUpperCase());
            } else {
                even.append(split[i]);
            }
            if (i % 2 != 0) {
                noEven.append(split[i].toUpperCase());
            } else {
                noEven.append(split[i]);
            }
        }

        return new String[]{even.toString(), noEven.toString()};
    }
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(Arrays.toString(capitalize(str)));
    }
}