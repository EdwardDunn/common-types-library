package com.abertay.common_types_lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class KilogramsTests {

	@Test
	public void whenIntKilogramValueUsed_ExpectStringResult() {	
		// arrange
		Kilograms kiloObject = new Kilograms(5);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "5kg";
		actualResult = kiloObject.getKilogramWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenDoubleKilogramValueUsed_ExpectStringResult() {	
		// arrange
		Kilograms kiloObject = new Kilograms(44.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "44kg";
		actualResult = kiloObject.getKilogramWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenFloatKilogramValueUsed_ExpectStringResult() {	
		// arrange
		Kilograms kiloObject = new Kilograms((float)57.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "57kg";
		actualResult = kiloObject.getKilogramWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringKilogramValueUsed_ExpectStringResult() {	
		// arrange
		Kilograms kiloObject = new Kilograms("1058");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "1058kg";
		actualResult = kiloObject.getKilogramWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringKilogramValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Kilograms kiloObject = new Kilograms("515.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "515kg";
		actualResult = kiloObject.getKilogramWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringKilogramValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Kilograms kiloObject = new Kilograms("77hjgghdSS");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "77kg";
		actualResult = kiloObject.getKilogramWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}

	
}
