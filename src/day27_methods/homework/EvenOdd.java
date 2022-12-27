package day27_methods.homework;


    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space

create a method that can print even numbers between 1-100 in the
same line saperated by space
     */
    public class EvenOdd {

        public static void odd() {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 1) {
                    System.out.print( i + " ");
                }
            }
            System.out.println();
        }
        public static void even() {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print( i + " ");
                }
            }
        }
        public static void main(String[] args) {
            odd();
            even();
        }
    }
