package weightpublisher;

public abstract class WeightTypeAbs implements WeightType {

	public double per;

	@Override
	public double convertToKilogram(double val) {
		return val * per;
	}

	@Override
	public double convertFromKilogram(double val) {		
		return val / per;
	}
	
	
}
