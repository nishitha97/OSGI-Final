package temperaturepublisher;

public class Kelvin implements temperatureType{

	@Override
	public double convertToKelvin(double val) {
		return val;
	}

	@Override
	public double convertFromKelvin(double val) {
		return val;
	}

}
