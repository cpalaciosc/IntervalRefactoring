package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum) {
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
