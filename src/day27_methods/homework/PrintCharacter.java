package day27_methods.homework;

public class PrintCharacter {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */
    public static void printCharacter(String str){
        for( char i=0; i<=str.length()-1; i++ ){
            System.out.println(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        printCharacter("java");
    }
}
