
package ru.job4j;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * 
 * @author Dmitry Lebedev (dylebedev@gmail.com)
 * @version $Id$
 * @since 06.03.2018
 */
public class CalculateTest{
	/**
	 * Test echo
	 */ @Test

	public void whenTakeNameThenTreeEchoPlusName(){
		String input = "Dmitry Lebedev";
		String expect = "Echo, echo, echo : Dmitry Lebedev";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}