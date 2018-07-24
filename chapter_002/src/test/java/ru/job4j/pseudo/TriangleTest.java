package ru.job4j.pseudo;

/**
 * Class TriangleTest
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 24.07.2018
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("   +   ")
                                .append("  + +  ")
                                .append(" +   + ")
                                .append("+++++++")
                                .toString()
                )
        );
    }
}