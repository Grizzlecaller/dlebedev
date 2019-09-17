package ru.codewars.strings;

/**
 * Class PigLatinTest
 * @author Dmitry Lebedev
 * @since 16.09.2019
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    }
    @Test
    public void a() {
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
    @Test
    public void b() {
        assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
    }

}
