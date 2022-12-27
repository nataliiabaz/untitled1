package day36_custom_classes.homework;

public class Hobby {
    /*
    create a class called Hobby

        - data:

            name, annual cost, is outdoors (boolean), requires others (boolean)

        - constructor

            - create a constructor that creates a Hobby object with the name

            - create a constructor that creates a Hobby object with the name and annual cost

            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others

        - method:

            - doIt():
                print: Doing $name-of-hobby $outside-or-inside

                    ex: new Hobby("golf", 100, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside

            - toString()
                print all the Hobby information

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

     */
    String name;
    int annualCost;
    boolean isOutdoors;
    boolean requiresOthers;


    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, int annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, int annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }
    public static String description;


    public void doIt() {

        if (isOutdoors) {
            System.out.println("Doing " + name + " outside");

        } else {
            System.out.println("Doing" + name + "inside");
        }

    }

    public String toString(){
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }


}
