package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public boolean includes(double value) {
		return (value>this.getMin()&&value<=this.getMax());
	}
	
	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(LeftOpenedInterval leftOpenedinterval) {
		return ((leftOpenedinterval.includes(this.getMin()) || (this.getMin()==leftOpenedinterval.getMin())) && leftOpenedinterval.includes(this.getMax()));
	}

	@Override
	public boolean includes(RightOpenedInterval rightOpenedinterval) {
		return ((rightOpenedinterval.includes(this.getMin()) || (this.getMin()==rightOpenedinterval.getMin())) && rightOpenedinterval.includes(this.getMax()));
	}

	@Override
	public boolean includes(BothOpenedInterval bothOpenedinterval) {
		return ((bothOpenedinterval.includes(this.getMin()) || (this.getMin()==bothOpenedinterval.getMin())) && bothOpenedinterval.includes(this.getMax()));
	}

	@Override
	public boolean includes(UnOpenedInterval unOpenedinterval) {
		return ((unOpenedinterval.includes(this.getMin()) || (this.getMin()==unOpenedinterval.getMin())) && unOpenedinterval.includes(this.getMax()));
	}

}
