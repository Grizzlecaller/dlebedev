package ru.job4j.transit;

/**
 * Class AccountTest
 * @author Dmitry Lebedev
 * @since 21.07.2019
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void whenTwoEqualsThenTrue() {
        Account one = new Account(1000, "qwerty");
        Account two = new Account(1000, "qwerty");
        assertThat(one.equals(two), is(true));
    }

    @Test
    public void whenAccHave1000Substract500ThenHave500() {
        Account one = new Account(1000, "qwerty");
        one.subAmount(500);
        assertThat(one.getValue(), is(500.0));
    }

    @Test
    public void whenAccHave500Add500ThenHave1000() {
        Account one = new Account(500, "qwerty");
        one.addAbount(500);
        assertThat(one.getValue(), is(1000.0));
    }

    @Test
    public void whenGetRequisites() {
        Account one = new Account(1000, "qwerty");
        assertThat(one.getRequisites(), is("qwerty"));
    }

}
