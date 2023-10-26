package homeworks.hm18;

public class IndividualEntrepreneur extends Client {
    private final String DEPOSIT_TERM;
    private final String WITHDRAW_TERM;

    {
        DEPOSIT_TERM = "Комиссия на пополнение счета составляет 1% при снятии суммы до 1000 UAH и 0.5% свыше 1000 UAH.";
        WITHDRAW_TERM = "Комиссия на снятие наличных средств составляет 0%.";
    }

    public IndividualEntrepreneur(double balance) {
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
        if(addMoney <= 0){
            throw new IllegalArgumentException("Сумма пополнения не может быть 0 или отрицательной");
        } else if (addMoney < 1000) {
            setBalance(getBalance() + (addMoney - (addMoney * 0.01)));
        } else {
            setBalance(getBalance() + (addMoney - addMoney * 0.005));
        }
    }

    @Override
    public void moneyWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            throw new IllegalArgumentException("Сумма снятия не может быть отрицательной или нулем");
        } else {
            double resultOfTransaction = getBalance() - withdrawalAmount;
            if (resultOfTransaction > 0) {
                setBalance(resultOfTransaction);
            } else {
                throw new IllegalArgumentException("На Вашем балансе не достаточно средств для снятия " + withdrawalAmount +
                        " UAH. На вашем счету " + getBalance() + " UAH");
            }
        }
    }

}
