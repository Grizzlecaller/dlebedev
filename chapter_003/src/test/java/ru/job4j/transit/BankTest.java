package ru.job4j.transit;

/**
 * Class BankTest
 * @author Dmitry Lebedev
 * @since 21.07.2019
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankTest {

   /* @Test
    public void whenAddUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Ammy", "123456"));
        bank.addUser(new User("Fred", "654321"));
        assertThat(bank.getUser("654321").getName(), is("Fred"));
    }*/

    @Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Fred", "654321"));
        bank.addAccountToUser("654321", new Account(500, "1"));
        Account expected = new Account(500, "1");
        assertThat(bank.getOneUserAccount("654321", "1"), is(expected));
    }

    @Test
    public void whenGetOneOfUserAccount() {
        Bank bank = new Bank();
        bank.addUser(new User("Ammy", "123456"));
        bank.addAccountToUser("123456", new Account(500, "1"));
        bank.addAccountToUser("123456", new Account(500, "2"));
        Account expected = new Account(60, "2");
        assertThat(bank.getOneUserAccount("123456", "2"), is(expected));
    }

    @Test
    public void whenTransferFromOneUser100ToAnotherThen300() {
        Bank bank = new Bank();
        bank.addUser(new User("Ammy", "123456"));
        bank.addUser(new User("Fred", "654321"));
        bank.addAccountToUser("123456", new Account(500, "123"));
        bank.addAccountToUser("654321", new Account(200, "321"));
        bank.transferMoney("123456", "123", "654321", "321", 100);
        assertThat(bank.getOneUserAccount("654321", "321").getValue(), is(300.0));
    }

    @Test
    public void whenTransferFromOneUserToAnotherThenTrue() {
        Bank bank = new Bank();
        bank.addUser(new User("Ammy", "123456"));
        bank.addUser(new User("Fred", "654321"));
        bank.addAccountToUser("123456", new Account(500, "123"));
        bank.addAccountToUser("654321", new Account(200, "321"));
        assertTrue(bank.transferMoney("123456", "123", "654321", "321", 100.0));
    }

    @Test
    public void whenTransferFromOneUserToAnotherButNotEnoughThenFalse() {
        Bank bank = new Bank();
        bank.addUser(new User("Ammy", "123456"));
        bank.addUser(new User("Fred", "654321"));
        bank.addAccountToUser("123456", new Account(1000, "123"));
        bank.addAccountToUser("654321", new Account(500, "321"));
        assertFalse(bank.transferMoney("123456", "123", "654321", "321", 1200.0));
    }
}
