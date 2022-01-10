package day60_collections;

public class Bank {

    double balance;
    public void withdraw(double money){
        if(balance <= 0){
            throw new NotEnoughMoneyException();
        }else if (money > balance){
            throw new IllegalArgumentException();
        }
        System.out.println("Withdrawing $ "+ money);
        balance -= money;
    }


}
