package homework;

public class GradeLevel {
    public static void main(String[] args) {
        int num=6;
        if(num>=1 && num<=18){
            if(num>=1 && num<=5) {
                System.out.println("Elementary school");
            } else if (num>=6 && num<=8){
                System.out.println("Middle school");
            } else if (num>=9 && num<=12){
                System.out.println("High school");
            } else if (num>=13 && num<=16){
                System.out.println("College");
            } else if (num>=17 && num<=18) {
                System.out.println("Grad School");
            }
        }else{
                System.out.println("Is not a valid grade");
            }
        }
    }

