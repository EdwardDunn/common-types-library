/**
 * Class - Centimetre
 * Description - Custom centimetre type that allows for int, double and float values to
 * be passed in. The returned value is corrected formatted with an optional suffix "cm".
 * 
 * Author - Edward Dunn
 * Version - 1.0
 */

package types;

public class Centimetres {

	private int centimetreValue;
	private String suffix = "cm";
	
	public Centimetres(int _value) {
		centimetreValue = _value;
	}
	
	public Centimetres(Double _value) {
		centimetreValue = _value.intValue();
	}
	
	public Centimetres(Float _value) {
		centimetreValue = _value.intValue();
	}
	
	public Centimetres(String _value) {
		// remove all non numeric characters from string
		_value = _value.replaceAll("\\D+","");
		
		// if _value is not null, parse to int. If _value is empty, set to zero
		centimetreValue = _value != null ? Integer.parseInt(_value) : 0;
	}
	
	public int getCentimetre() {
		return centimetreValue;
	}
	
	public String getCentimetreWithSuffix() {
		return centimetreValue + suffix;
	}
	
}

