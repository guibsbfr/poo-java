package entities;

public class Account {

    private String holder;
    private double balance;
    private int number;

    // Constructors

    public Account() {}

    public Account (String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    // Getters and Setters


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    //methods

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }


    public void initialDeposit(double amount) {
        this.balance += amount;
    }


    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + balance;
    }


}
