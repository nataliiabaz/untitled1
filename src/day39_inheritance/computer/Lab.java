package day39_inheritance.computer;

import day39_inheritance.computer.Mac;
import day39_inheritance.computer.Windows;

public class Lab {
    public static void main(String[] args) {
        Mac computer1 = new Mac(1000);
        System.out.println(computer1);

        Windows computer2 = new Windows(2000);
        System.out.println(computer2);

    }
}

