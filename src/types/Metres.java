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
	
	public int getMetre() {
		return metreValue;
	}
	
	public String getmetreWithSuffix() {
		return metreValue + suffix;
	}
	
}
