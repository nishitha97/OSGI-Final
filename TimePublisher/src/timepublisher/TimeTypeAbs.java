package timepublisher;

public abstract class TimeTypeAbs implements TimeType {
public double per;
	
	
	
	@Override
	public double convertToSecond(double val) {
		return val * per;
	};
	
	@Override
	public double convertFromSecond(double val) {
		return val / per;
	};
}
