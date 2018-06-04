package com.abertay.common_types_lib;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abertay.common_types_lib.Metres;


public class MetresTests {

	@Test
	public void whenIntMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres(9);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "9m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenDoubleMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres(44.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "44m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenFloatMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres((float)663.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "663m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringMetreValueUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres("412");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "412m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringMetreValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres("105.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "105m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringMetreValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Metres metreObject = new Metres("55sdcsdghl");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "55m";
		actualResult = metreObject.getMetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
}
