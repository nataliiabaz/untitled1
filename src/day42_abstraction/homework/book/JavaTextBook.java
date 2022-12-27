package day42_abstraction.homework.book;

public class JavaTextBook extends EBook{
    /*
    Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
     */
    String fun;
    @Override
    public void open(){
        System.out.println("Open the book");
    }
    public  void read(){
        System.out.println("Read the book");
    }
    public void download(){
        System.out.println("Download the book");

    }
}
