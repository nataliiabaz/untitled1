package day40_inheritance.overriding.homework.season;

public class Summer extends Season {
    /*
    Create a class Summer

	child class of Season

	constructor: set values to variables
	methods:
		activity(): Drink Lemonade
     */

    public Summer(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);
    }
    @Override
    public String activity(){
        return "Drink lemonade";
    }

}
