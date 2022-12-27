package day16_string;

public class Email {
    public static void main(String[] args) {
        String email="saim@cydeo.com";
        int indexOfAt=email.indexOf('@');
        String name=email.substring(0, indexOfAt);
        int indexOfDot= email.indexOf('.');
        String domain=email.substring(indexOfAt+1,indexOfDot);
        System.out.println("Full email:"+email);
        System.out.println("name part:"+name);
        System.out.println("domain part:"+domain);
    }
}
