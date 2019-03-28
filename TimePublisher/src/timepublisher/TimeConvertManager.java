package timepublisher;

import java.util.HashMap;

public class TimeConvertManager {
	public final static HashMap<String, TimeType> timeTypes = new HashMap<String, TimeType>();

	public static TimeConvertManager getInstance() {
		TimeConvertManager TCM = new TimeConvertManager();

		timeTypes.put(StringConstTime.millisecond, new Milisecond());
		timeTypes.put(StringConstTime.second, new Second());
		timeTypes.put(StringConstTime.minute, new Minute());
		timeTypes.put(StringConstTime.hour, new Hour());
		timeTypes.put(StringConstTime.day, new Day());
		timeTypes.put(StringConstTime.month, new Month());
		timeTypes.put(StringConstTime.year, new Year());

		return TCM;
	}

	private TimeConvertManager() {

	}

//	public static void main(String args[]) {
//
//		TimeConvertManager LM = TimeConvertManager.getInstance();
//		System.out.println(LM.getResult(StringConstTime.month, StringConstTime.second, 1));
//
//	}

	public static double getResult(String fromType, String toType, double val) {

		TimeType fromTimeObject = timeTypes.get(fromType);
		TimeType toTimeObject = timeTypes.get(toType);

		double seconds = fromTimeObject.convertToSecond(val);

		return toTimeObject.convertFromSecond(seconds);

	}

}
