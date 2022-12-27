package day40_inheritance.overriding;

public class FinalExamples {
     public final int a=10;
    public final int b;
    public static final String PLANET = "Earth";

    // public static final -> these keyword together is what makes a constant

    public FinalExamples(int num) {
        b = num; // when the object is created, the given argument will be the value of b, then it cannot be changed
    }
}
