package day42_abstraction;

public class Bench extends Lifting{

        @Override
        public void perform() {
            System.out.println("Bench press");
        }

        @Override
        public void getCaloriesBurned(int minutes) {
            System.out.println(10 * minutes);
        }

        @Override
        public void rackWeights() {
            System.out.println("Putting the bar back on the rack");
        }
    } // Bench is my concrete class

