package day36_custom_classes.homework;

public class Hobby1 {
    public static void main(String[] args) {


        Hobby hobby1 = new Hobby("Golf", 200, true, false);

        hobby1.doIt();
        Hobby.description="Nice";

        System.out.println(hobby1.toString());
        System.out.println( Hobby.description);


    }


}
