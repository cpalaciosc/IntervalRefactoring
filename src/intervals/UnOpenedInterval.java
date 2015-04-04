package intervals;

public class UnOpenedInterval extends Interval {

	public UnOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public boolean includes(double value) {
		return (value>=this.getMin().getValue()&&value<=this.getMax().getValue());
	}
	
	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean execute(Interval interval) {
		return includeMinimum(interval) && includeMaximum(interval);
	}

}
