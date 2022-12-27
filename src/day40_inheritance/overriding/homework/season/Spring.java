package day40_inheritance.overriding.homework.season;

public class Spring extends Season {
    /*
    Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside
     */

    public Spring(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);
    }
    @Override
    public String activity(){
        return "Go outside";
    }
}
