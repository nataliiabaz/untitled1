package day42_abstraction.homework.book;

public class RunBook {
    public static void main(String[] args) {
        JavaTextBook book= new JavaTextBook();
        book.open();
        book.read();
        book.download();

    }
}
