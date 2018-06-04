package com.abertay.common_types_lib;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abertay.common_types_lib.Millimetres;


public class MillimetreTests {

	@Test
	public void whenIntMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres(11);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "11mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenDoubleMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres(25.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "25mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenFloatMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres((float)5.0);
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "5mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringMillimetreValueUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres("3");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "3mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringMillimetreValueWithDecimalUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres("80.0");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "80mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void whenStringMillimetreValueWithRandomCharactersUsed_ExpectStringResult() {	
		// arrange
		Millimetres milObject = new Millimetres("6ghjghj");
		String expectedResult = "";
		String actualResult = "";
		
		// act
		expectedResult = "6mm";
		actualResult = milObject.getMillimetreWithSuffix();
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
}
