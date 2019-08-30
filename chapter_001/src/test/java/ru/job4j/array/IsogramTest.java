package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsogramTest {
    @Test
    public void fixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", Isogram.disemvowel("This website is for losers LOL!"));
    }

    @Test
    public void a() {
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Isogram.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
    }

    @Test
    public void b() {
        assertEquals("Wht r y,  cmmnst?", Isogram.disemvowel("What are you, a communist?"));
    }
}
