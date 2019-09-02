package ru.codewars.strings;

/**
 * Class RemoveCharsTest
 * @author Dmitry Lebedev
 * @since 02.09.2019
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCharsTest {


        @Test
        public void testRemoval() {
            assertEquals("loquen", RemoveChars.remove("eloquent"));
        }
        @Test
        public void a() {
            assertEquals("ountr", RemoveChars.remove("country"));
        }
        @Test
        public void b() {
            assertEquals("erso", RemoveChars.remove("person"));
        }
        @Test
        public void c() {
            assertEquals("lac", RemoveChars.remove("place"));
        }

}
