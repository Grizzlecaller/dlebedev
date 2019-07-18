package ru.job4j.transit;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Class Bank
 * @author Dmitry Lebedev
 * @since 18.07.2019
 */

public class Bank {
    private TreeMap<User, ArrayList<Account>> treemap = new TreeMap<>();

    public void addUser(User user) {
        this.treemap.put(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        this.treemap.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        this.treemap.get(passport).add(account);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        this.treemap.get(passport).remove(account);
    }

    public List<Account> getUserAccounts(String passport) {
        return this.treemap.get(passport);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dstRequisite,
                                 double amount) {
        return this.treemap.get(srcPassport).contains(srcRequisite)
                && this.treemap.get(destPassport).contains(dstRequisite)
                && getUserAccounts(srcPassport).transfer(
                getUserAccounts(destPassport), amount);
    }

    public String toString() {
        return "Bank{" + "accounts=" + treemap + "}";
    }
}
