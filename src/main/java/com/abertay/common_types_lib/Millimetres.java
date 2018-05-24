/**
 * Class - Millimetre
 * Description - Custom millimetre type that allows for int, double and float values to
 * be passed in. The returned value is corrected formatted with an optional suffix "mm".
 * 
 * Author - Edward Dunn
 * Version - 1.0
 */

package com.abertay.common_types_lib;

public class Millimetres {

	private int millimetreValue;
	private String suffix = "mm";
	
	public Millimetres(int _value) {
		millimetreValue = _value;
	}
	
	public Millimetres(Double _value) {
		millimetreValue = _value.intValue();
	}
	
	public Millimetres(Float _value) {
		millimetreValue = _value.intValue();
	}
	
	public Millimetres(String _value) {
		// remove all non numeric characters from string
		_value = _value.replaceAll("\\D.+","");
		
		// if _value is not null, parse to int. If _value is empty, set to zero
		millimetreValue = _value != null ? Integer.parseInt(_value) : 0;
	}
	
	public int getMillimetre() {
		return millimetreValue;
	}
	
	public String getMillimetreWithSuffix() {
		return millimetreValue + suffix;
	}
	
}
