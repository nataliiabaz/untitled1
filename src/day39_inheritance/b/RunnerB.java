package day39_inheritance.b;

import day39_inheritance.a.Condo;

public class RunnerB {
    public static void main(String[] args) {
        //Q: What did I inherit, what do I have access to
        // same package
        Condo condo = new Condo();
        condo.address = "1312 l";
        //condo.city = "Chicago"; no accessible outside the package


    }
}

