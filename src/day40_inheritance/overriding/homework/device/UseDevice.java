package day40_inheritance.overriding.homework.device;

import day40_inheritance.overriding.homework.device.Phone;
import day40_inheritance.overriding.homework.device.TV;

public class UseDevice {
    /*
    Create a class UseDevice

	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List  is a relations of all the classes

     */
    public static void main(String[] args) {
        TV tv= new TV("LG", "TR", 1200, true);
        System.out.println(tv);
        System.out.println(tv.useDevice());
        Phone phone= new Phone("Samsung","S 22", 1200, true);
        System.out.println(phone);
        System.out.println(phone.useDevice());
    }
}
