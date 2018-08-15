package level.jbc.two.bank;

public class CreditAccount extends Account{

    CreditAccount(int amount) {
        super(amount);
        comission = 20;
    }

    @Override
    protected int getMoneyFromAccount(int value) {
        return value -  (int)((float)value * (comission / 100.0));
    }

    @Override
    protected void putMoneyIntoTheAccount(int value) {

    }
}
