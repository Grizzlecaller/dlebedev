package ru.codewars.strings;

/**
 * Class CheckingGroupsTest
 * @author Dmitry Lebedev
 * @since 03.09.2019
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class CheckingGroupsTest {
    /*@Test
    public void myTests() {
        assertEquals(CheckingGroups.groupCheck("(((())))"), true);
    }
    @Test
    public void a() {
        assertEquals(CheckingGroups.groupCheck("({"), false);
    }
    @Test
    public void b() {
        assertEquals(CheckingGroups.groupCheck("{(})"), false);
    }
    @Test
    public void c() {
        assertEquals(CheckingGroups.groupCheck("([]{}[[[}}[{]]"), false);
    }
    @Test
    public void d() {
        assertEquals(CheckingGroups.groupCheck("[((())))(()))]"), false);
    }
    @Test
    public void e() {
        assertEquals(CheckingGroups.groupCheck("{[({[(())]})]}"), true);
    }*/
    @Test
    public void f() {
        CheckingGroups groups = new CheckingGroups();
        boolean result = groups.groupCheck("{[({[(())]})]}");
        assertThat(result, is(true));
    }
    @Test
    public void g() {
        CheckingGroups groups = new CheckingGroups();
        boolean result = groups.groupCheck("[((())))(()))]");
        assertThat(result, is(false));
    }
}
