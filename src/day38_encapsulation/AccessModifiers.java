package day38_encapsulation;

public class AccessModifiers {
    public int a=5;
    int b=10;// default access b is default, is only visible in the same package
    private int c=20;// c is private, only visible in the same class

    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);//b is default, is only visible in the same package
        System.out.println(obj.c);//c is private, only visible in the same class
    }

}
