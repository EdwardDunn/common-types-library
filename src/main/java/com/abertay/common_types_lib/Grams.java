package com.abertay.common_types_lib;

public class Grams {

	private int gramValue;
	private String suffix = "g";
	
	public Grams(int _value) {
		gramValue = _value;
	}
	
	public Grams(Double _value) {
		gramValue = _value.intValue();
	}
	
	public Grams(Float _value) {
		gramValue = _value.intValue();
	}
	
	public Grams(String _value) {
		// remove all non numeric characters from string
		_value = _value.replaceAll("\\D.+","");
		
		// if _value is not null, parse to int. If _value is empty, set to zero
		gramValue = _value != null ? Integer.parseInt(_value) : 0;
	}
	
	public int getGram() {
		return gramValue;
	}
	
	public String getGramWithSuffix() {
		return gramValue + suffix;
	}
	
	
}
	
