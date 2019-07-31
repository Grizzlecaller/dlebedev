package ru.job4j.transit;

import java.util.*;

/**
 * Class Bank
 * @author Dmitry Lebedev
 * @since 18.07.2019
 */

public class Bank {
    private Map<User, ArrayList<Account>> treemap = new TreeMap<>();

    void addUser(User user) {
        ArrayList<Account> accList = new ArrayList<>();
        treemap.putIfAbsent(user, accList);
    }

    /*public User getUser(String passport) {
        Optional<User> searched = this.treemap.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findAny();
        return searched.get();
    }*/

    void deleteUser(User user) {
        if (treemap.get(user) != null) {
            treemap.remove(user);
        }
    }

    /*public void addAccountToUser(String passport, Account account) {
        ArrayList<Account> tmp = this.treemap.get(getUser(passport));
        tmp.add(account);
    }*/

    void addAccountToUser(String passport, Account account) {
        //this.treemap.putIfAbsent(user, new ArrayList<>());
        //this.treemap.get(user).add(account);
        if (passport != null && account != null) {
            for (User user : treemap.keySet()) {
                if (user.getPassport().equals(passport)) {
                    treemap.get(user).add(account);
                    break;
                }
            }
        }
    }

    /*public void deleteAccountFromUser(String passport, Account account) {
        this.treemap.get(getUser(passport)).remove(account);
    }*/

    void deleteAccountFromUser(String passport, Account account) {
        if (passport != null && account != null) {
            for (User user : treemap.keySet()) {
                if (user.getPassport().equals(passport)) {
                    treemap.get(user).remove(account);
                    break;
                }
            }
        }
    }

    List<Account> getUserAccounts(String passport) {
        List<Account> userAcc = new ArrayList<>();
        if (passport != null) {
            for (User user : treemap.keySet()) {
                if (user.getPassport().equals(passport)) {
                    userAcc = treemap.get(user);
                }
            }
        }
        return userAcc;
    }

   /* public Account getOneUserAccount(String requisite, User user) {
        List<Account> accounts = getUserAccounts(user);
        int tmp = accounts.indexOf(new Account(0, requisite));
        return accounts.get(tmp);
    }*/

    List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.addAll(this.treemap.keySet());
        return users;
    }

    /*public boolean transferMoney(String srcPassport, String srcRequisite,
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
    }*/

    boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean result = false;
        if (this.treemap.get(srcUser).contains(srcAccount)
                && this.treemap.get(dstUser).contains(dstAccount)
                && srcAccount.getValue() >= amount) {
            srcAccount.setValue(srcAccount.getValue() - amount);
            dstAccount.setValue(dstAccount.getValue() + amount);
            result = true;
        }
        return result;
    }

    public String toString() {
        return "Bank{" + "accounts=" + treemap + "}";
    }
}
