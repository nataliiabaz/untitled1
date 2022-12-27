package day40_inheritance.overriding;

public class RunShapes {
    public static void main(String[] args) {
        Circle circle=new Circle(3.4);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}
