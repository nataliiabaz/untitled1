package homework.interview;

import java.util.Arrays;

public class AlphanumericString {

    //String - Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together.
    //        Ex:
    //            Input: "DC501GCCCA098911"
    //            Output: "CD015ACCCG011899"

    public static String sortLettersAndNumbers(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    result += ",";
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    result += ",";
                }
            }
        }
        String[] arr = result.split(",");
        str = "";

        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortLettersAndNumbers("dfgh456fg9k"));
    }
}
