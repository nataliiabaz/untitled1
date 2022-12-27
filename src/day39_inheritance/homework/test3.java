package day39_inheritance.homework;

public class test3 {
    public static void main(String[] args) {
        Developer employee1=new Developer("Nataliia", true, 345786,true);
        employee1.work();
        System.out.println(employee1);
        employee1.develop();
        Tester employee2=new Tester("Nataliia",true, 654789,true);
        employee2.test();
        System.out.println(employee2);


    }
}
