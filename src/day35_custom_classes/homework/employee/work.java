package day35_custom_classes.homework.employee;

import day35_custom_classes.homework.employee.Employee;

public class work {
    public static void main(String[] args) {
        Employee james=new Employee("James Bond",7,"Spy",10_000_000);
        james.goToMeeting();
        System.out.println(james);
    }
}
