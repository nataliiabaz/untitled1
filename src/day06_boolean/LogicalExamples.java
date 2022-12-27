package day06_boolean;

public class LogicalExamples {
    public static void main(String[] args) {
       boolean isWeekend=true;
       boolean isGoodTemp=true;
       boolean doBbq=isWeekend && isGoodTemp;
        System.out.println("Do bbq:"+doBbq);

        boolean isTeacher= true;
        boolean isPolice= false;
        boolean isFirefighter=false;
        boolean getDiscount = isTeacher|| isPolice ||  isFirefighter;
        System.out.println("Get discount:" +getDiscount);



    }
}
