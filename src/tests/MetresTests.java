package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import types.Metres;

class MetresTests {

	@Test
	void whenIntMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres(9);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "9m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from a integer value");
	}
	
	@Test
	void whenDoubleMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres(44.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "44m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from a double value");
	}
	
	@Test
	void whenFloatMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres((float)663.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "663m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from float value");
	}
	
	@Test
	void whenStringMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres("412");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "412m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value");
	}
	
	@Test
	void whenStringMetreValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres("105.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "105m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value with decimal");
	}
	
	@Test
	void whenStringMetreValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres("55sdcsdghl");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "55m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value with random characters");
	}
	
}
