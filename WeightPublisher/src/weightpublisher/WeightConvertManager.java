package weightpublisher;

import java.util.HashMap;



public class WeightConvertManager {

	public StringConstWeight stringConstWeight;

	public static WeightConvertManager getInstance() {
		
		WeightConvertManager WM = new WeightConvertManager();
		map.put(StringConstWeight.decigram, new DeciGram());
		map.put(StringConstWeight.gram, new Gram());
		map.put(StringConstWeight.kilogram, new Kilogram());
		map.put(StringConstWeight.metricTon, new MetricTon());
		map.put(StringConstWeight.miligram, new MiliGram());
		map.put(StringConstWeight.ounce, new Ounce());
		map.put(StringConstWeight.pound, new Pounds());
		
		return WM;
	}

	public final static HashMap<String, WeightType> map = new HashMap<String, WeightType>();


	public static double getResult(String from, String to, double val) {

		WeightType fro = map.get(from);
		WeightType t = map.get(to);

		double kilogram = fro.convertToKilogram(val);
		

		return t.convertFromKilogram(kilogram);

	}


}
