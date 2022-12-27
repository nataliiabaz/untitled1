package day36_custom_classes.homework;
/*
Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHobby {
    public static void main(String[] args) {


       ArrayList <Hobby> allHobby = new ArrayList<>(Arrays.asList());

        allHobby.add(new Hobby("skate",100,true,false));
        allHobby.add(new Hobby("volleyball",50,true,true));
        allHobby.add(new Hobby("swimming",550,false,false));
        allHobby.add(new Hobby("photography",600,true,true));

        for(Hobby each :allHobby){
            each.doIt();
        }
        ArrayList<Hobby>removeIsOutdoors=new ArrayList<>(allHobby);
        removeIsOutdoors.removeIf(each->each.isOutdoors);
        System.out.println(removeIsOutdoors);
        ArrayList<Hobby>removeRequiresOthers=new ArrayList<>(allHobby);
        removeRequiresOthers.removeIf(each->each.requiresOthers);
        System.out.println(removeRequiresOthers);
        ArrayList<Hobby>removeAnnualCost=new ArrayList<>(allHobby);
        removeAnnualCost.removeIf(each->each.annualCost>500);
        System.out.println(removeAnnualCost);

    }

}
