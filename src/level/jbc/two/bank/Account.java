package level.jbc.two.bank;

public abstract class Account {

    protected int comission;
    protected int amount;
    protected int rate;

    Account(int amount){
        this.amount = amount;
    }

    protected abstract int getMoneyFromAccount(int value);

    protected abstract void putMoneyIntoTheAccount(int value);
}
