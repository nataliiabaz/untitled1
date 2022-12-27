package day15_practice;

public class StringMethods2 {
    public static void main(String[] args) {
        String word="Java";
        System.out.println(word.startsWith("J"));
        System.out.println(word.startsWith("Ja"));
        System.out.println(word.startsWith("jae"));
        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("Java"));
        boolean b=word.startsWith("J");
        String word2= "Hello word today";
        System.out.println(word2.startsWith("Hello word"));
        String str="Nataliia is a good mother";
        System.out.println("str.contains(N) "+str.contains("N"));
        System.out.println(str.contains("Nat"));
        System.out.println(str.contains("is a good") && str.contains("mother"));


    }
}
