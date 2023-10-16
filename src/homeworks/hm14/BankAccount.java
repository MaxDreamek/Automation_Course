package homeworks.hm14;


public class BankAccount {
    private String bankAccountName = null;
    private double balance = 0.0;

    public BankAccount(String bankAccountName, double balance) {
        this.bankAccountName = bankAccountName;
        this.balance = balance;
    }

    public void withdraw(double cost) throws InsufficientFundsException, NegativeBalanceException {
        if (this.balance < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается.");
        } else if (this.balance - cost < 0) {
            throw new InsufficientFundsException("Ошибка: Недостаточно средств на счете.");
        } else {
            this.balance -= cost;
        }
    }

    public void deposit(double refill) {
        this.balance += refill;
    }

    public void transferTo(BankAccount account, double sum) throws InsufficientFundsException, NegativeBalanceException {
        if (this.balance < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается.");
        } else if (this.balance - sum < 0) {
            throw new InsufficientFundsException("Ошибка: Недостаточно средств на счете.");
        } else {
            this.balance -= sum;
            account.balance += sum;
        }
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

