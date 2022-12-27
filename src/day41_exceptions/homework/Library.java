package day41_exceptions.homework;

public class Library {
    /*
    Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file

     */

    public static String getLibraryCard (String city) {
        if (city.equals("Fairfax") || city.equals("McLean")) {
            return " Library Card Created";
        } else {
            throw new NonResidentException("Non resident for this library");
        }
    }
            public static String borrow (boolean checkout )throws FailToCheckOutException {
            if (checkout){
                return "Enjoy reading";

        }else{
                throw new FailToCheckOutException("Not a valid card");
            }
    }

    public static void main(String[] args) {
        System.out.println(getLibraryCard("Chicago"));
    }


}
