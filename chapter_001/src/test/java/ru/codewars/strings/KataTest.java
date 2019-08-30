package ru.codewars.strings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));

    }

    @Test
    public void oddTests() {
        assertEquals("t", Kata.getMiddle("testing"));

    }

    @Test
    public void a() {
        assertEquals("dd", Kata.getMiddle("middle"));
    }

    @Test
    public void b() {
        assertEquals("A", Kata.getMiddle("A"));
    }

    @Test
    public void c() {
        assertEquals("T", Kata.getMiddle("QwertyTryHard"));
    }
}