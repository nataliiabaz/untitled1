package day40_inheritance.overriding.homework.olympic;

public class Surfing extends OlympicGames {
    /*
    Create a class Surfing

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Surfing the waves

     */

    public Surfing(String name, int participants) {
        super(name, participants);
    }
    public String compete(){
        return "Surfing the waves";
    }
}
