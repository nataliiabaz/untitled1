package day14_string;

public class StringMethods1 {
    public static void main(String[] args) {
        String item="pen";
        String item2=new String("pen");
        System.out.println(item==item2);
        String item3=new String("pen");
        System.out.println(item2==item3);
        System.out.println(item.equals(item2));
        String day="Tuesday";
        System.out.println(day.length());
        String word="Summer";
        word.toUpperCase();
        System.out.println(word);
        word=word.toUpperCase();
        System.out.println(word);
        String sentence="hello My NAME is";
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence);
        String s="        java      ";
        System.out.println(s.length());
        s=s.trim();
        System.out.println(s);
        System.out.println(s.length());

    }
}
