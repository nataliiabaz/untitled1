package day37_static.homework;

public class DebitCard1 {
    public static void main(String[] args) {
        DebitCard debitCard1=new DebitCard(1234567890123456L, "Nataliia",
                 7865);
        System.out.println(DebitCard.accountType);

        DebitCard debitCard2= new DebitCard(5467898,"Nataliia","VISA",345645,766555 );
        System.out.println(debitCard2);
        System.out.println(debitCard1);

    }
}
