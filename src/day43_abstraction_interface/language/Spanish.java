package day43_abstraction_interface.language;

import day43_abstraction_interface.language.Language;

public class Spanish implements Language {
    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");

    }
}
