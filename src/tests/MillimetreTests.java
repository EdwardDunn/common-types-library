package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import types.Millimetres;

class MillimetreTests {

	@Test
	void whenIntMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres(11);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "11mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from a integer value");
	}
	
	@Test
	void whenDoubleMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres(25.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "25mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from a double value");
	}
	
	@Test
	void whenFloatMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres((float)5.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "5mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from float value");
	}
	
	@Test
	void whenStringMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres("3");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "3mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value");
	}
	
	@Test
	void whenStringMillimetreValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres("80.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "80mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value with decimal");
	}
	
	@Test
	void whenStringMillimetreValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres("6ghjghj");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "6mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value with random characters");
	}


}
