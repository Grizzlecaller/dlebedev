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

    private static final User fred = new User("Fred", "654321");
    private static final User ammy = new User("Ammy", "123456");
    private static final Account ammyAccOne = new Account(1000, "1654321");
    private static final Account fredAccOne = new Account(1500, "1123456");
    private static final Account ammyAccTwo = new Account(2000, "2654321");
    private static final Account fredAccTwo = new Account(2500, "2123456");

    @Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        bank.addUser(fred);
        bank.addAccountToUser(fredAccOne, fred);
        bank.addAccountToUser(fredAccTwo, fred);
        assertThat(bank.getUserAccounts(fred).get(1).getRequisites(), is("2123456"));
    }

    @Test
    public void whenAddTwoUsersAndDeleteOneUserThenAllUsersIsOne() {
        Bank bank = new Bank();
        bank.addUser(ammy);
        bank.addUser(fred);
        bank.deleteUser(fred);
        assertThat(bank.getAllUsers().size(), is(1));
    }

    @Test
    public void whenDeleteAccFromUser() {
        Bank bank = new Bank();
        bank.addUser(ammy);
        bank.addAccountToUser(ammyAccOne, ammy);
        bank.addAccountToUser(ammyAccTwo, ammy);
        bank.deleteAccountFromUser(ammyAccOne, ammy);
        assertThat(bank.getUserAccounts(ammy).size(), is(1));
    }

    @Test
    public void whenGetUserAccounts() {
        Bank bank = new Bank();
        bank.addUser(fred);
        bank.addAccountToUser(fredAccOne, fred);
        bank.addAccountToUser(fredAccTwo, fred);
        assertThat(bank.getUserAccounts(fred).size(), is(2));
    }

    @Test
    public void whenTranferMoneyAmmyToFredThenFredHaveAddMoney() {
        Bank bank = new Bank();
        bank.addUser(fred);
        bank.addUser(ammy);
        bank.addAccountToUser(fredAccOne, fred);
        bank.addAccountToUser(ammyAccOne, ammy);
        bank.transferMoney(ammy, ammyAccOne, fred, fredAccOne, 500);
        assertThat(bank.getUserAccounts(fred).get(0).getValue(), is(2000.0));
    }
    @Test
    public void whenTranferMoneyAmmyToFredThenAmmyHaveSubMoney() {
        Bank bank = new Bank();
        bank.addUser(fred);
        bank.addUser(ammy);
        bank.addAccountToUser(fredAccOne, fred);
        bank.addAccountToUser(ammyAccTwo, ammy);
        bank.transferMoney(ammy, ammyAccTwo, fred, fredAccOne, 500);
        assertThat(bank.getUserAccounts(ammy).get(0).getValue(), is(1500.0));
    }
    /*@Test
    public void whenGetOneOfUserAccount() {
        Bank bank = new Bank();
        bank.addUser(new User("Ammy", "123456"));
        bank.addAccountToUser( "123456", new Account(500, "1"));
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
    }*/
}
