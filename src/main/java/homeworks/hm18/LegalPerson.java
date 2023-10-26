package homeworks.hm18;

public class LegalPerson extends Client{
    private final String DEPOSIT_TERM;
    private final String WITHDRAW_TERM;

    {
        DEPOSIT_TERM = "Комиссия на пополнение счета составляет 0%.";
        WITHDRAW_TERM = "Комиссия на снятие наличных средств составляет 1%.";
    }
    public LegalPerson(double balance) {
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
        if (addMoney <= 0) {
            throw new IllegalArgumentException("Сумма пополнения не может быть 0 или отрицательной");
        } else {
            setBalance(getBalance() + addMoney);
        }
    }

    @Override
    public void moneyWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            throw new IllegalArgumentException("Сумма снятия не может быть отрицательной или нулем");
        } else {
            double resultOfTransaction = getBalance() - withdrawalAmount - withdrawalAmount * 0.01;
            if (resultOfTransaction > 0) {
                setBalance(resultOfTransaction);
            } else {
                throw new IllegalArgumentException("На Вашем балансе не достаточно средств для снятия " + withdrawalAmount +
                        " UAH. На вашем счету " + getBalance() + " UAH");
            }
        }
    }
}
