package day49_functional_interface.driver;

public class UsingNumber {
    public static void main(String[] args) {
        NumberInterface evenOrOdd = (n) -> {
            if (n % 2 == 2) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };
        evenOrOdd.test(67);
        evenOrOdd.test(10);


        NumberInterface cube = (n)  ->
            System.out.println(n*n*n);

        cube.test(6);
    }
}
