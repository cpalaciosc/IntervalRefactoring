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
		return ((this.includes(interval.getMin()) || (interval.getMin()==this.getMin()))) && ((this.includes(interval.getMax()) || (interval.getMax()==this.getMax())));
	}

}
