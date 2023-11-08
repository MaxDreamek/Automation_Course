package homeworks.hm18;

public class PhysicalPerson extends Client {
    private final String DEPOSIT_TERM;
    private final String WITHDRAW_TERM;

    {
        DEPOSIT_TERM = "Комиссия на пополнение счета составляет 0%.";
        WITHDRAW_TERM = "Комиссия на снятие наличных средств составляет 0%.";
    }

    public PhysicalPerson(double balance) {
        super(balance);
    }

    @Override
    public void showMyBalance() {
        System.out.println(getBalance());
    }

    @Override
    public void printBankAccountInfo() {
        System.out.println(DEPOSIT_TERM + '\n' + WITHDRAW_TERM + '\n' + "Ваш баланс составляет " + getBalance() + " UAH");
    }

    @Override
    public void deposit(double addMoney) {
        checkForNegativeSumArgument(addMoney, "Сумма пополнения не может быть 0 или отрицательной", true);
        setBalance(getBalance() + addMoney);
    }

    @Override
    public void moneyWithdrawal(double withdrawalAmount) {
        checkForNegativeSumArgument(withdrawalAmount, "Сумма снятия не может быть отрицательной или нулем", true);
        double resultOfTransaction = getBalance() - withdrawalAmount;
        checkResultOfTransaction(resultOfTransaction, withdrawalAmount);
        setBalance(resultOfTransaction);
    }
}
