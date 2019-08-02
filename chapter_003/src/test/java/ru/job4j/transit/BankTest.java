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

    private static final User FRED = new User("Fred", "654321");
    private static final User AMMY = new User("Ammy", "123456");
    private static final Account AMMY_ACC_ONE = new Account(1000, "1654321");
    private static final Account FRED_ACC_ONE = new Account(1500, "1123456");
    private static final Account AMMY_ACC_TWO = new Account(2000, "2654321");
    private static final Account FRED_ACC_TWO = new Account(2500, "2123456");

    @Test
    public void whenAddUserAndAccToUserThenUserHaveOneAcc() {
        Bank bank = new Bank();
        bank.addUser(FRED);
        bank.addAccountToUser(FRED.getPassport(), FRED_ACC_ONE);
        assertThat(bank.getUserAccounts(FRED.getPassport()).get(0).getRequisites(), is("1123456"));
    }

    @Test
    public void whenAddUsersAmmyAndFredThenBankHaveTwoAcc() {
        Bank bank = new Bank();
        bank.addUser(AMMY);
        bank.addUser(FRED);
        assertThat(bank.getAllUsers().size(), is(2));
    }

    @Test
    public void whenAddUsersAmmyAndFredAndDeleteFredThenBankHaveOneUserAmmy() {
        Bank bank = new Bank();
        bank.addUser(AMMY);
        bank.addUser(FRED);
        bank.deleteUser(FRED);
        assertThat(bank.getAllUsers().size(), is(1));
    }

    @Test
    public void whenAddUserAmmyAndAddAmmyTwoAccAndDeleteOneOfThemThenUserAmmyHaveOneAcc() {
        Bank bank = new Bank();
        bank.addUser(AMMY);
        bank.addAccountToUser(AMMY.getPassport(), AMMY_ACC_ONE);
        bank.addAccountToUser(AMMY.getPassport(), AMMY_ACC_TWO);
        bank.deleteAccountFromUser(AMMY.getPassport(), AMMY_ACC_ONE);
        assertThat(bank.getUserAccounts(AMMY.getPassport()).size(), is(1));
    }

    @Test
    public void whenAmmyTransfer500MoneyToFreedThenFredHas2000Money() {
        Bank bank = new Bank();
        bank.addUser(AMMY);
        bank.addUser(FRED);
        bank.addAccountToUser(AMMY.getPassport(), AMMY_ACC_TWO);
        bank.addAccountToUser(FRED.getPassport(), FRED_ACC_ONE);
        bank.transferMoney(AMMY.getPassport(), AMMY_ACC_TWO.getRequisites(), FRED.getPassport(), FRED_ACC_ONE.getRequisites(), 500);
        assertThat(AMMY_ACC_TWO.getValue(), is(1500.0));
    }




    /*@Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        bank.addUser(FRED);
        bank.addAccountToUser(FRED_ACC_ONE, FRED);
        bank.addAccountToUser(FRED_ACC_TWO, FRED);
        assertThat(bank.getUserAccounts(FRED).get(1).getRequisites(), is("2123456"));
    }*/

    /*@Test
    public void whenAddTwoUsersAndDeleteOneUserThenAllUsersIsOne() {
        Bank bank = new Bank();
        bank.addUser(AMMY);
        bank.addUser(FRED);
        bank.deleteUser(FRED);
        assertThat(bank.getAllUsers().size(), is(1));
    }*/

    /*@Test
    public void whenDeleteAccFromUser() {
        Bank bank = new Bank();
        bank.addUser(AMMY);
        bank.addAccountToUser(AMMY_ACC_ONE, AMMY);
        bank.addAccountToUser(AMMY_ACC_TWO, AMMY);
        bank.deleteAccountFromUser(AMMY_ACC_ONE, AMMY);
        assertThat(bank.getUserAccounts(AMMY).size(), is(1));
    }*/

    /*@Test
    public void whenGetUserAccounts() {
        Bank bank = new Bank();
        bank.addUser(FRED);
        bank.addAccountToUser(FRED_ACC_ONE, FRED);
        bank.addAccountToUser(FRED_ACC_TWO, FRED);
        assertThat(bank.getUserAccounts(FRED).size(), is(2));
    }*/

    /*@Test
    public void whenTranferMoneyAmmyToFredThenFredHaveAddMoney() {
        Bank bank = new Bank();
        bank.addUser(FRED);
        bank.addUser(AMMY);
        bank.addAccountToUser(FRED_ACC_ONE, FRED);
        bank.addAccountToUser(AMMY_ACC_ONE, AMMY);
        bank.transferMoney(AMMY, AMMY_ACC_ONE, FRED, FRED_ACC_ONE, 500);
        assertThat(bank.getUserAccounts(FRED).get(0).getValue(), is(2000.0));
    }*/

    /*@Test
    public void whenTranferMoneyAmmyToFredThenAmmyHaveSubMoney() {
        Bank bank = new Bank();
        bank.addUser(FRED);
        bank.addUser(AMMY);
        bank.addAccountToUser(FRED_ACC_ONE, FRED);
        bank.addAccountToUser(AMMY_ACC_TWO, AMMY);
        bank.transferMoney(AMMY, AMMY_ACC_TWO, FRED, FRED_ACC_ONE, 500);
        assertThat(bank.getUserAccounts(AMMY).get(0).getValue(), is(1500.0));
    }*/
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
