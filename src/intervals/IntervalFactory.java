package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening){
			case LEFT_OPENED:
				return new Interval(new OpenPoint(minimum), new ClosePoint(maximum));
			case RIGHT_OPENED:
				return new Interval(new ClosePoint(minimum), new OpenPoint(maximum));
			case BOTH_OPENED:
				return new Interval(new OpenPoint(minimum), new OpenPoint(maximum));
			case UNOPENED:
				return new Interval(new ClosePoint(minimum), new ClosePoint(maximum));
			default:
				throw new IllegalArgumentException("Wrong Opening parameter");
		}	
	}
}
