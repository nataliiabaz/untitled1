package homework;

public class GiftCard {
    public static void main(String[] args) {

        /*create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end */
        int giftCard = 500;
        int timesUsed = 3;
        System.out.println("Gift card used ones");
        timesUsed--;
        System.out.println(giftCard - 150);
        giftCard-=150;
        timesUsed--;
        System.out.println(giftCard - 99);
        System.out.println("Balance:"+giftCard);

    }   }