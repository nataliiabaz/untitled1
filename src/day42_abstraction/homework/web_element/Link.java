package day42_abstraction.homework.web_element;

public class Link implements WebElement, Clickable{
    public void  getText(){
        System.out.println("Get text");
    }
    public void click(){
        System.out.println("Click the button");
    }
}
