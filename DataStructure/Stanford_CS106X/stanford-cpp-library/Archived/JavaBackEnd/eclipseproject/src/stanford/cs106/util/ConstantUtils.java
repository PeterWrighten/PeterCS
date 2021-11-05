package stanford.cs106.util;

public class ConstantUtils {
	public static String makeConstantString(String text) {
		return new String(text);
	}
	
	@SuppressWarnings("deprecation")
	public static Integer makeConstantInteger(Integer value) {
		return new Integer(value);
	}
	
	@SuppressWarnings("deprecation")
	public static Double makeConstantDouble(Double value) {
		return new Double(value);
	}
}
