package day40_inheritance.overriding.homework.season;

public class Fall extends Season {
    /*
    Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book
     */

    public Fall(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);
    }
    @Override
    public String activity(){
        return "Read a book";
    }
}
