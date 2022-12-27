package day30_wrapper.homework;

public class UpperCase {
    public static boolean UpperCase(String str) {
        /*
        Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true
         */


        int upper = 0, lower = 0;
        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)) {
                upper ++;
            } else if (Character.isLowerCase(letter)) {
                lower ++;


                }
            }

            return upper==lower;
        }



    public static void main(String[] args) {
        String str = "JAVA javaaa";
        System.out.println(UpperCase(str));
    }

}