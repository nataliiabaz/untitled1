package officeHours;

public class practice_methods {
    public static void main(String[] args) {
        printWordNTimes("Rabia",3);
        printWordNTimes("Adam",3);
        printWordNTimes("Nataliia",5);
    }
    public static void printWordNTimes(String name, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(name);

        }
    }

}
