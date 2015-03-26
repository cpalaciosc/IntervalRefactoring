package intervals;

public class UnOpenedInterval extends Interval {

	public UnOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public boolean includes(double value) {
		return (value>=this.getMin()&&value<=this.getMax());
	}
	
	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean execute(Interval interval) {
		final boolean includeMinimum = interval.includes(this.getMin());
		final boolean includeMaximum = interval.includes(this.getMax());
		return includeMinimum && includeMaximum;
	}

}
