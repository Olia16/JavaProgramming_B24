package day60_collections;

public class UseBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.balance = 500;
        bank.withdraw(250);
       // bank.withdraw(1000);
        bank.balance = -10;

        bank.withdraw(20);

    }
}
