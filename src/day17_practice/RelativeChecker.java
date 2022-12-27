package day17_practice;

public class RelativeChecker {
    public static void main(String[] args) {
        String name1="James Bond";
        String name2="James Bond";
        int indexOfSpace=name1.lastIndexOf(' ');
        String lastName=name1.substring(indexOfSpace+1);
        if (name2.endsWith(lastName)) {
            System.out.println("Related");
        }else{
            System.out.println("Not related");
        }
        System.out.println(name2.endsWith(lastName)?"Related":"Not related");
    }
}
