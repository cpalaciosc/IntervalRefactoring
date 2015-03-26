package intervals;

public class UnOpenedInterval extends Interval {

	public UnOpenedInterval(double minimum, double maximum) {
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
