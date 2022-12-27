package homework;

public class Nataliia {
    String name="Nataliia";
    private int age=43;
    private String color="white";

    public int getAge(){
        return age;

    }

    public String getColor() {
        return color;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Nataliia(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nataliia{" +
                "name='" + name + '\'' +
                '}';
    }
}
