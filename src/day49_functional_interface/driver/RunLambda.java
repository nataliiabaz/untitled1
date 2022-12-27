package day49_functional_interface.driver;

public class RunLambda {
    public static void main(String[] args) {
        Lambda cube=x-> System.out.println(x*x*x);
        cube.function(9);

    }
}
