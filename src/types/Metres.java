/**
 * Class - Metres
 * Description - Custom metres type that allows for int, double and float values to
 * be passed in. The returned value is corrected formatted with an optional suffix "m".
 * 
 * Author - Edward Dunn
 * Version - 1.0
 */

package types;

public class Metres {

	private int metreValue;
	private String suffix = "m";
	
	public Metres(int _value) {
		metreValue = _value;
	}
	
	public Metres(Double _value) {
		metreValue = _value.intValue();
	}
	
	public Metres(Float _value) {
		metreValue = _value.intValue();
	}
	
	public Metres(String _value) {
		// remove all non numeric characters from string
		_value = _value.replaceAll("\\D+","");
		
		// if _value is not null, parse to int. If _value is empty, set to zero
		metreValue = _value != null ? Integer.parseInt(_value) : 0;
	}
	
	public int getMetre() {
		return metreValue;
	}
	
	public String getmetreWithSuffix() {
		return metreValue + suffix;
	}
	
}
