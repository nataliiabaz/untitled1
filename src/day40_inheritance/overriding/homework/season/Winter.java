package day40_inheritance.overriding.homework.season;

import day40_inheritance.overriding.homework.season.Season;

public class Winter extends Season {
    /*
    Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace
     */

    public Winter(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);
    }
    @Override
    public String activity(){
        return "Use fireplace";
    }
}
