package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening){
			case LEFT_OPENED:
				return new LeftOpenedInterval(new Point(minimum,OpeningPointType.OPEN), new Point(maximum,OpeningPointType.CLOSED));
			case RIGHT_OPENED:
				return new RightOpenedInterval(new Point(minimum,OpeningPointType.CLOSED), new Point(maximum,OpeningPointType.OPEN));
			case BOTH_OPENED:
				return new BothOpenedInterval(new Point(minimum,OpeningPointType.OPEN), new Point(maximum,OpeningPointType.OPEN));
			case UNOPENED:
				return new UnOpenedInterval(new Point(minimum,OpeningPointType.CLOSED), new Point(maximum,OpeningPointType.CLOSED));
			default:
				throw new IllegalArgumentException("Wrong Opening parameter");
		}	
	}
}
