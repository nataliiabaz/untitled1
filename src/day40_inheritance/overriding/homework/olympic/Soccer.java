package day40_inheritance.overriding.homework.olympic;

public class Soccer extends OlympicGames {
    /*
    Create a class Soccer

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Playing a soccer game
     */

    public Soccer(String name, int participants) {
        super(name, participants);
    }

    public String compete(){
        return "Playing a soccer game";
    }
}
