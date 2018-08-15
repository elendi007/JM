package level.jbc.two.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Person person1 = new Person("Ivan");

        bank.addPerson(person1);
        bank.addAccountForPerson(person1, new CreditAccount(5000));
        bank.addAccountForPerson(person1, new DebitAccount(2000));

        System.out.println(bank.dataBase.get(person1).get(1).getMoneyFromAccount(100));
        System.out.println(bank.dataBase.get(person1).get(0).getMoneyFromAccount(100));
    }
}
