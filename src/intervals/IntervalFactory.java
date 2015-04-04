package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening){
			case LEFT_OPENED:
				return new Interval(new Point(minimum,OpeningPointType.OPEN), new Point(maximum,OpeningPointType.CLOSED));
			case RIGHT_OPENED:
				return new Interval(new Point(minimum,OpeningPointType.CLOSED), new Point(maximum,OpeningPointType.OPEN));
			case BOTH_OPENED:
				return new Interval(new Point(minimum,OpeningPointType.OPEN), new Point(maximum,OpeningPointType.OPEN));
			case UNOPENED:
				return new Interval(new Point(minimum,OpeningPointType.CLOSED), new Point(maximum,OpeningPointType.CLOSED));
			default:
				throw new IllegalArgumentException("Wrong Opening parameter");
		}	
	}
}
