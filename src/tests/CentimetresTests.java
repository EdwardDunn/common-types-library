package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import types.Centimetres;

class CentimetresTests {

	@Test
	void whenIntCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres(29);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "29cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from a integer value");
	}
	
	@Test
	void whenDoubleCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres(744.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "744cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from a double value");
	}
	
	@Test
	void whenFloatCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres((float)17.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "17cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from float value");
	}
	
	@Test
	void whenStringCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres("66");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "66cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value");
	}
	
	@Test
	void whenStringCentimetreValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres("805.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "805cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value with decimal");
	}
	
	@Test
	void whenStringCentimetreValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres("6ghjghj");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "6cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult, "Incorrect string value returned from string value with random characters");
	}


}
