package day41_exceptions.homework;

public class RunLibrary {
    /*
    Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution
     */
    public static void main(String[] args) {
        System.out.println(Library.getLibraryCard("Fairfax"));
        System.out.println(Library.getLibraryCard("Chicago"));
        System.out.println("-------------------------------------");
        try {
            System.out.println(Library.borrow(false));

        } catch (FailToCheckOutException e) {

            e.printStackTrace();
        }
    }
}
