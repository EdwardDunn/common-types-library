package com.abertay.common_types_lib;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abertay.common_types_lib.Centimetres;


public class CentimetresTests {

	@Test
	public void whenIntCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres(29);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "29cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenDoubleCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres(744.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "744cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenFloatCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres((float)17.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "17cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringCentimetreValueUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres("66");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "66cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringCentimetreValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres("805.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "805cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringCentimetreValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Centimetres centObject = new Centimetres("6ghjghj");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "6cm";
		actualResult = centObject.getCentimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}


}
