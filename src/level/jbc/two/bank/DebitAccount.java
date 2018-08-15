package level.jbc.two.bank;

public class DebitAccount extends Account{

    DebitAccount(int amount) {
        super(amount);
        rate = 6;
    }

    @Override
    protected int getMoneyFromAccount(int value) {
        return value;
    }

    @Override
    protected void putMoneyIntoTheAccount(int value) {
        amount = (rate/100) * value + value;
    }
}
