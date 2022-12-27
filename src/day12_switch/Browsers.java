package day12_switch;

public class Browsers {
    public static void main(String[] args) {
        String browser="chrome";
        switch (browser){
            case "chrome":
            case "CHROME":
             case "Chrome":
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
                break;
            case "safari":
                System.out.println("Special set up or apples computers");
                System.out.println("opening google in safari");
                break;

            default:
                System.out.println("Opening in chrome by default");

        }
    }
}
