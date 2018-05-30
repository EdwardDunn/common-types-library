package com.abertay.common_types_lib;

public class Kilograms {

	private int kilogramValue;
	private String suffix = "kg";
	
	public Kilograms(int _value) {
		kilogramValue = _value;
	}
	
	public Kilograms(Double _value) {
		kilogramValue = _value.intValue();
	}
	
	public Kilograms(Float _value) {
		kilogramValue = _value.intValue();
	}
	
	public Kilograms(String _value) {
		// remove all non numeric characters from string
		_value = _value.replaceAll("\\D.+","");
		
		// if _value is not null, parse to int. If _value is empty, set to zero
		kilogramValue = _value != null ? Integer.parseInt(_value) : 0;
	}
	
	public int getKilogram() {
		return kilogramValue;
	}
	
	public String getKilogranWithSuffix() {
		return kilogramValue + suffix;
	}
	
	
}
