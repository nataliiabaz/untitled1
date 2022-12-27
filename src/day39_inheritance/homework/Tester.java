package day39_inheritance.homework;

public class Tester extends Employee {



        boolean bugsFound;

    public Tester(String name, boolean isFullTime, double salary, boolean bugsFound) {
        super(name, isFullTime, salary);
        this.bugsFound = bugsFound;
    }

    public void test() {
            System.out.println("Running the regression");
        }

    @Override
    public String toString() {
        return "Tester{" +
                "bugsFound=" + bugsFound +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}


