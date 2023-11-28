package login;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

    List<Account> list = new ArrayList<>();

    public List<Account> getListaAccounts() {
        return list;
    }

    public AccountService() {
        list.add(new Account("tk1", "1", "1"));
        list.add(new Account("tk2", "2", "2"));
        list.add(new Account("tk3", "3", "3"));
        list.add(new Account("tk4", "4", "4"));
    }
}
