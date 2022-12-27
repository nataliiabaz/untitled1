package day42_abstraction.homework.web_element;

public class RunWebElement {
    public static void main(String[] args) {
        Button button=new Button();
        button.getText();
        button.click();
        Link link= new Link();
        link.getText();
        link.click();
        InputField field=new InputField();
        field.click();
        field.getText();
        field.sendKeys();
    }
}

