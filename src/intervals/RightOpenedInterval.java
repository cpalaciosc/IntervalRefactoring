package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public boolean includes(double value) {
		return (value>=this.getMin()&&value<this.getMax());
	}
	
	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean execute(Interval interval) {
		return (includeMaximum(interval) || sameMaximum(interval)) && includeMinimum(interval);
	}

}
