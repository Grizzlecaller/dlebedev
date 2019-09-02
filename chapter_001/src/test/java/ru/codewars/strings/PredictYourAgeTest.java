package ru.codewars.strings;

/**
 * Class PredictYourAgeTest
 * @author Dmitry Lebedev
 * @since 02.09.2019
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PredictYourAgeTest {
    @Test
    public void fixedTests() {
        assertEquals(86, PredictYourAge.predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        assertEquals(79, PredictYourAge.predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }
}