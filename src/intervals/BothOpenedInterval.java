package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
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
