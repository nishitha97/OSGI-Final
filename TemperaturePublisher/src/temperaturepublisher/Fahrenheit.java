package temperaturepublisher;

public class Fahrenheit implements temperatureType {
	@Override
	public double convertToKelvin(double val) {
		return 5/9*(val - 32) + 273;
	};
	
	@Override
	public double convertFromKelvin(double val) {
		return 9/5*(val - 273) + 32;
		
	};
}
