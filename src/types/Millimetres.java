/**
 * Class - Millimetre
 * Description - Custom millimetre type that allows for int, double and float values to
 * be passed in. The returned value is corrected formatted with an optional suffix "mm".
 * 
 * Author - Edward Dunn
 * Version - 1.0
 */

package types;

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
	
	public int getMillimetre() {
		return millimetreValue;
	}
	
	public String getMillimetreWithSuffix() {
		return millimetreValue + suffix;
	}
	
}
