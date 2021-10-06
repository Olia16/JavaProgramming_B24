package office_hours.practice_10_06_2021;

public class BankAccount {
    String fullName;
    double balance;
    long accountNumber;
    String accountType;

    public BankAccount(String name, double amount, long accNum, String accType){
        fullName = name;
        balance = amount;
        accountNumber = accNum;
        accountType = accType;
    }

    public double checkBalance(){
        return balance;
    }

    public double deposit(double money){
        balance += money;
        return balance;
    }

    public double withdraw(double money){

        if(money > 0 && balance >= money){
            balance -= money;
        }

        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
