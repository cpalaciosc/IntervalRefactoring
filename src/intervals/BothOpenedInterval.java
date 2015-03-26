package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public boolean includes(double value) {
		return (value>this.getMin()&&value<this.getMax());
	}
	
	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}
	
	@Override
	public boolean execute(Interval interval) {
		return (includeMinimum(interval) || sameMinimum(interval)) && (includeMaximum(interval) || sameMaximum(interval));
	}

}
