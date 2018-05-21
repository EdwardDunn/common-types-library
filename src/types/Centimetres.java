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
	
	public int getCentimetre() {
		return centimetreValue;
	}
	
	public String getCentimetreWithSuffix() {
		return centimetreValue + suffix;
	}
	
}

