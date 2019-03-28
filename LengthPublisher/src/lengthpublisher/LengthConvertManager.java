package lengthpublisher;

import java.util.HashMap;

public class LengthConvertManager {

	public static LengthConvertManager getInstance() {
		LengthConvertManager LM = new LengthConvertManager();
		map.put(StringConstLength.centimeter, new Centimeters());
		map.put(StringConstLength.meter, new Meters());
		map.put(StringConstLength.kiloMeter, new Kilometers());
		map.put(StringConstLength.feet, new Feet());
		map.put(StringConstLength.inches, new Inches());
		map.put(StringConstLength.miles, new Miles());
		return LM;
	}

	public final static HashMap<String, lengthType> map = new HashMap<String, lengthType>();

	// public static void main(String args[]) {
	//
	// LengthConvertManager LM = LengthConvertManager.getInstance();
	// System.out.println(LM.getResult(StringConstLength.kiloMeter,
	// StringConstLength.meter, 1));
	//
	// }

	public static double getResult(String from, String to, double val) {

		lengthType fro = map.get(from);
		lengthType t = map.get(to);

		double meters = fro.convertToMeters(val);

		return t.convertFromMeters(meters);

	}

	// public static void addLengthToMap(String s ,lengthType l) {
	// map.put(s, l);
	// }
}
