package my_utils;

import day38_encapsulation.AccessModifiers;

public class TestingAccessOutside {
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.a);
        /*System.out.println(obj.b); b is default, is only visible in the same package
       System.out.println(obj.c); c is private, only visible in the same class*/
    }
}
