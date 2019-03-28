package lengthpublisher;

public abstract class LengthTypeAbs implements lengthType {

	public double per;
	
	@Override
	public double convertToMeters(double val) {
		return val * per;
	};
	
	@Override
	public double convertFromMeters(double val) {
		return val / per;
	};
}
