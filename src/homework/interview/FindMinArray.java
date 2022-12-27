package homework.interview;

public class FindMinArray {
    //Question1: Array - Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static int minimumNumber(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int each : num) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[]num={34,76,90,56,0,87};
        System.out.println(minimumNumber(num));
    }

}
