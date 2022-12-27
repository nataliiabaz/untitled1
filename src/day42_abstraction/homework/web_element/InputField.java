package day42_abstraction.homework.web_element;

public class InputField implements WebElement,Clickable, Input{
    public void  getText(){
        System.out.println("Get text");
    }
    public void click(){
        System.out.println("Click the button");
    }
    public void sendKeys(){
        System.out.println("Send keys");
    }
}
