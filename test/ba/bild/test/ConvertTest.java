package ba.bild.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ba.bild.code.Convertor;

public class ConvertTest {

	Convertor convert;

	@Before
	public void setUp() {
		convert = new Convertor();
	}

	@Test
	public void shouldReturnKgWhenConvertKgToPounds() {
		double result = convert.kgToPounds(1.0);
		assertEquals(2.205, result, 0);
	}

	@Test
	public void shouldReturnPoundsWhenConvertPoundsToKg() {
		double result = convert.poundsToKg(1.0);
		assertEquals(0.453592, result, 0);
	}

	@Test
	public void shouldReturnCmWhenConvertCmToInch() {
		double result = convert.cmToInch(1.0);
		assertEquals(0.393701, result, 0);
	}

	@Test
	public void shouldReturnInchWhenConvertInchToCm() {
		double result = convert.inchToCm(1.0);
		assertEquals(2.54, result, 0);
	}

	@Test
	public void shouldReturnCelsiusWhenConvertCelsiusToFarenheit() {
		double result = convert.celsiusToFarenheit(1.0);
		assertEquals(33.8, result, 0);
	}

	@Test
	public void shouldReturnFarenheitWhenConvertFarenheitToCelsius() {
		double result = convert.farenheitToCelsius(1.0);
		assertEquals(-17.22222222222222, result, 0);
	}

}
