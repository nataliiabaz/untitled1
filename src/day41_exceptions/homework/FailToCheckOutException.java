package day41_exceptions.homework;

public class FailToCheckOutException extends Exception {
    /*
    Create a class FailToCheckOutException
    make this a checked exception

    create a constructor to accept the String argument and pass it to the super constructor
     */
        public FailToCheckOutException(String str2){
            super(str2);
        }
}
