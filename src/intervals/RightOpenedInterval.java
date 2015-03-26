package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public boolean includes(double value) {
		return false;
	}

	@Override
	public boolean includes(Interval interval) {
		return false;
	}

}
