package day40_inheritance.overriding.homework.season;

public class Season {
    /*
    Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes

Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace

Create a class Summer

	child class of Season

	constructor: set values to variables
	methods:
		activity(): Drink Lemonade

Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book

Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside

Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes


     */
    public String name;
    public double highestTemp;
    public double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }
    public String activity(){
        return null;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestTemp=" + highestTemp +
                ", lowestTemp=" + lowestTemp +
                '}';
    }
}
