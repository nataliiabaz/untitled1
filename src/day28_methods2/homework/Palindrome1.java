package day28_methods2.homework;

public class Palindrome1 {
/*
create a method that will accept a String and find if it is Palindrome or not (boolean)
 */
    public static boolean isPalindrome(String str) {
        String reverse = "";
        boolean result = true;
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            result = true;}
            return result;
        }
        public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
    }
}



