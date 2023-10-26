package homeworks.hm18;

public abstract class Client {
    private double balance;

    public Client(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        } else {
            this.balance = balance;
        }
    }

    abstract void printBankAccountInfo();
    abstract void showMyBalance();

    abstract void deposit(double addMoney);

    abstract void moneyWithdrawal(double withdrawalAmount);

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        } else {
            this.balance = balance;
        }
    }
}
