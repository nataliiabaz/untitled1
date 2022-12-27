package day40_inheritance.overriding.homework.olympic;

public class Track extends OlympicGames {
    /*
    Create a class Track

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Track for running, jumping, throwing
     */

    public Track(String name, int participants) {
        super(name, participants);
    }
    @Override
    public String compete(){
        return "Track for running, jumping, throwing";
    }
}
