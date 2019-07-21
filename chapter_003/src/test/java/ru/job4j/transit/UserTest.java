package ru.job4j.transit;

/**
 * Class UserTest
 * @author Dmitry Lebedev
 * @since 21.07.2019
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenTwoEqualsThenTrue() {
        User one = new User("Fred", "123456");
        User two = new User("Fred", "123456");
        assertThat(one.equals(two), is(true));
    }

    @Test
    public void whenTwoEqualsNameButPassportNotThenFalse() {
        User one = new User("Fred", "123456");
        User two = new User("Fred", "654321");
        assertThat(one.equals(two), is(false));
    }
}
