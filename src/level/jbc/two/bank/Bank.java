package level.jbc.two.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank{

    Map<Person, ArrayList<Account>> dataBase = new HashMap<>();

    public void addPerson(Person person){
        dataBase.put(person, new ArrayList<Account>());
    }

    public void addAccountForPerson(Person person, Account account){
        dataBase.get(person).add(account);
    }
}
