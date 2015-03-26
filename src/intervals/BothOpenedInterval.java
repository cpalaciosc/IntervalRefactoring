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
		final boolean sameMinimum = this.getMin()==interval.getMin();
		final boolean sameMaximum = this.getMax()==interval.getMax();
		final boolean includeMinimum = interval.includes(this.getMin());
		final boolean includeMaximum = interval.includes(this.getMax());
		return (includeMinimum || sameMinimum) && (includeMaximum || sameMaximum);
	}

}
