package homeworks.hm18;

public abstract class Client {
    private double balance;

    public Client(double balance) {
        checkForNegativeSumArgument(balance, "Баланс не может быть отрицательным", false);
        this.balance = balance;
    }

    abstract void printBankAccountInfo();
    abstract void showMyBalance();

    abstract void deposit(double addMoney);

    abstract void moneyWithdrawal(double withdrawalAmount);

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        checkForNegativeSumArgument(balance,"Баланс не может быть отрицательным", false);
            this.balance = balance;

    }
    protected void checkForNegativeSumArgument(double sum, String exceptionName, boolean includingZero){
        if(includingZero && sum <= 0){
            throw new IllegalArgumentException(exceptionName);
        } else if ((!includingZero) && sum < 0) {
            throw new IllegalArgumentException(exceptionName);
        }
    }
    protected void checkResultOfTransaction(double resultTransaction, double withdrawalAmount){
        if(resultTransaction < 0){
            throw new IllegalArgumentException("На Вашем балансе не достаточно средств для снятия " + withdrawalAmount +
                    " UAH. На вашем счету " + getBalance() + " UAH");
        }
    }
}
