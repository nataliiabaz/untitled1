package day40_inheritance.overriding.homework.olympic;

public class OlympicGames {
    /*
    Create a class OlympicSport

	instance variables
		- name (String)
		- participants (int)

	constructor:
		- initialize all fields

	methods:
		- compete(), toString()

		override compete in sub classes

Create a class Surfing

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Surfing the waves

Create a class Track

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Track for running, jumping, throwing

Create a class Soccer

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Playing a soccer game

     */
    public String name;
    public int participants;

    public OlympicGames(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public String compete(){
        return null;
    }

    @Override
    public String toString() {
        return "OlympicGames{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
