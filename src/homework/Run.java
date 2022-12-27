package homework;

public class Run {
    public static void main(String[] args) {
        Nataliia nataliia= new Nataliia("Nataliia");
        System.out.println(nataliia.getAge());
        nataliia.setAge(44);
        System.out.println(nataliia.getAge());
        System.out.println(nataliia.getColor());
        nataliia.setColor("black");
        System.out.println(nataliia.getColor());
        System.out.println(nataliia);
    }
}
