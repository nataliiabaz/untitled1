package day09_singleIf;

public class bank {
    public static void main(String[] args) {
        double balance=1000000;
        double amountToWithdraw=150;
        balance-= amountToWithdraw;
        System.out.println("Withdraw:"+ amountToWithdraw);
        if (balance>=0){
            System.out.println("Account balanceis:"+balance);
        }
        if (balance<0){
            System.out.println("Overdraft penalty");
            System.out.println("Amount due:"+amountToWithdraw*0.25);
        }


    }
}
