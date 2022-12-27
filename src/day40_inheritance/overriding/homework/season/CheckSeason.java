package day40_inheritance.overriding.homework.season;

public class CheckSeason {
    /*
    Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List  is a relations of all the classes
     */
    public static void main(String[] args) {
        Winter winter=new Winter("Winter", 10, -30);
        System.out.println(winter);
        System.out.println(winter.activity());
        Summer summer=new Summer("Summer",35,10);
        System.out.println(summer);
        System.out.println(summer.activity());
        Fall fall=new Fall("Fall",25, -5);
        System.out.println(fall);
        System.out.println(fall.activity());
        Spring spring =new Spring("Spring", 25, 5);
        System.out.println(spring);
        System.out.println(spring.activity());

    }
}
