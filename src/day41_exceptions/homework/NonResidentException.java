package day41_exceptions.homework;

public class NonResidentException extends RuntimeException {
    /*
    Create a class NonResidentException
    make this a unchecked exception

    create a constructor to accept the String argument and pass it to the super constructor

 Create a class FailToCheckOutException
    make this a checked exception

    create a constructor to accept the String argument and pass it to the super constructor

     */
    public NonResidentException(String str){
        super(str);
    }
}
