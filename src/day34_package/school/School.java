package day34_package.school;

public class School {
    public static void main(String[] args) {
        Student studentOne=new Student();
        System.out.println(studentOne);
        studentOne.name="Nataliia";
        studentOne.batchNumber=27;
        studentOne.program="SDET";
        studentOne.grade=99.99;
        System.out.println(studentOne);
        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);
    }
}
