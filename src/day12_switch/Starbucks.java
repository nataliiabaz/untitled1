package day12_switch;

public class Starbucks {
    public static void main(String[] args) {

        String size = "tall";
        double price = 0;
        int calories = 0;
        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
        }
        System.out.println("size: " + size + " is " + calories + " calories and costs $ " + price);
    }

}
