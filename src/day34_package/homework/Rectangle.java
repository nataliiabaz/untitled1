package day34_package.homework;

public class Rectangle {
    /*
    Create a class Rectangle

create instance variables:
    base, height, perimeter, area

create instance methods:

    - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area

    - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width
     */
    int base;
    int height;
    int perimeter;
    int area;


    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public void calculatePerimeter(){
        perimeter=(base+height)*2;
        System.out.println("Perimeter = " +perimeter);
    }
    public void calculateArea(){
        area=base*height;
        System.out.println("Area = "+ area);
    }
}
