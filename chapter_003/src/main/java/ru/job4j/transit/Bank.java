package ru.job4j.transit;

import java.util.*;

/**
 * Class Bank
 * @author Dmitry Lebedev
 * @since 18.07.2019
 */

public class Bank {
    private Map<User, ArrayList<Account>> treemap = new TreeMap<>();

    public void addUser(User user) {
        this.treemap.put(user, new ArrayList<>());
    }

    public User getUser(String passport) {
        Optional<User> searched = this.treemap.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findAny();

        return searched.get();
    }

    public void deleteUser(User user) {
        this.treemap.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        ArrayList<Account> tmp = this.treemap.get(getUser(passport));
        tmp.add(account);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        this.treemap.get(getUser(passport)).remove(account);
    }

    public List<Account> getUserAccounts(String passport) {
        return this.treemap.get(getUser(passport));
    }

    public Account getOneUserAccount(String passport, String requisite) {
        List<Account> accounts = getUserAccounts(passport);
        int tmp = accounts.indexOf(new Account(0, requisite));
        return accounts.get(tmp);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String dstPassport, String dstRequisite, double amount) {
        boolean valid = false;
        Account src = getOneUserAccount(srcPassport, srcRequisite);
        Account dst = getOneUserAccount(dstPassport, dstRequisite);
        if (src != null && dst != null) {
            if (amount > 0 && amount < src.getValue() && src.getValue() != 0) {
                src.subAmount(amount);
                dst.addAbount(amount);
                valid = true;
            }
        }
        return valid;
    }

    public String toString() {
        return "Bank{" + "accounts=" + treemap + "}";
    }
}
