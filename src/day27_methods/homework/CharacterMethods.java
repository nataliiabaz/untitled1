package day27_methods.homework;

public class CharacterMethods {
    /*
    Character Methods

    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9
     */
    public static void upperCaseLetters() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

    }

    public static void lowerCaseLetters() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void reverseUpperCaseLetters() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }

    }

    public static void reverseLowerCaseLetters() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");

        }
    }
    public static void numbers(){
        for(char i='0'; i<='9'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        upperCaseLetters();
        System.out.println();
        lowerCaseLetters();
        System.out.println();
        reverseUpperCaseLetters();
        System.out.println();
        reverseLowerCaseLetters();
        System.out.println();
        numbers();

    }
}




