package ru.codewars.strings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import ru.codewars.strings.IsogramNew;

public class IsogramNewTest {
    @Test
    public void fixedTests() {
        assertEquals(true, IsogramNew.isIsogram("Dermatoglyphics"));
    }
    @Test
    public void a() {
        assertEquals(true, IsogramNew.isIsogram("qwer"));
    }
    @Test
    public void b() {
        assertEquals(true, IsogramNew.isIsogram("thumbscrewjapingly"));
    }
    @Test
    public void c() {
        assertEquals(false, IsogramNew.isIsogram("moOse"));
    }
    @Test
    public void d() {
        assertEquals(false, IsogramNew.isIsogram("aba"));
    }
    @Test
    public void e() {
        assertEquals(false, IsogramNew.isIsogram("isIsogram"));
    }
    @Test
    public void f() {
        assertEquals(false, IsogramNew.isIsogram("moose"));
    }
    @Test
    public void g() {
        assertEquals(true, IsogramNew.isIsogram("isogram"));
    }
}