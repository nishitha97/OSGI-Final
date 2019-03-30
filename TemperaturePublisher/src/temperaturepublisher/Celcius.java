package temperaturepublisher;

public class Celcius implements temperatureType {
	@Override
	public double convertToKelvin(double val) {
		return val + 273.15;
	};
	
	@Override
	public double convertFromKelvin(double val) {
		return val - 273.15;
	};
}
