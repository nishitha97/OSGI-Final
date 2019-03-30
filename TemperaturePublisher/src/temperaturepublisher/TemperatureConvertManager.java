package temperaturepublisher;

import java.util.HashMap;

import temperaturepublisher.Celcius;
import temperaturepublisher.Fahrenheit;
import temperaturepublisher.Kelvin;
import temperaturepublisher.TemperatureConvertManager;
import temperaturepublisher.StringConstTemperature;
import temperaturepublisher.temperatureType;

public class TemperatureConvertManager {
	
	public static TemperatureConvertManager getInstance() {
		TemperatureConvertManager TM = new TemperatureConvertManager();
		map.put(StringConstTemperature.celcius, new Celcius());
		map.put(StringConstTemperature.fahrenheit, new Fahrenheit());
		map.put(StringConstTemperature.kelvin, new Kelvin());
		return TM;
	}

	public final static HashMap<String, temperatureType> map = new HashMap<String, temperatureType>();

//	 public static void main(String[] args) {
//	
//		 TemperatureConvertManager LM = TemperatureConvertManager.getInstance();
//	 System.out.println(LM.getResult(StringConstTemperature.kelvin,
//			 StringConstTemperature.celcius, 1));
//	
//	 }

	public double getResult(String from, String to, double val) {

		temperatureType fro = map.get(from);
		temperatureType t = map.get(to);

		double kelvin = fro.convertToKelvin(val);

		return t.convertFromKelvin(kelvin);

	}

}

