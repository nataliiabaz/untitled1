package homework;

import java.sql.SQLOutput;

public class RunFood {
    public static void main(String[] args) {
        Food food1=new Food("Pizza", 7, 15.0);

        System.out.println(food1.calculatePrice());
        System.out.println(food1);

    }
}
