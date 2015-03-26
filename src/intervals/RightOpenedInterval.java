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
	public boolean includes(LeftOpenedInterval leftOpenedinterval) {
		return ((leftOpenedinterval.includes(this.getMax()) || (this.getMax()==leftOpenedinterval.getMax())) && leftOpenedinterval.includes(this.getMin()));
	}

	@Override
	public boolean includes(RightOpenedInterval rightOpenedinterval) {
		return ((rightOpenedinterval.includes(this.getMax()) || (this.getMax()==rightOpenedinterval.getMax())) && rightOpenedinterval.includes(this.getMin()));
	}

	@Override
	public boolean includes(BothOpenedInterval bothOpenedinterval) {
		return ((bothOpenedinterval.includes(this.getMax()) || (this.getMax()==bothOpenedinterval.getMax())) && bothOpenedinterval.includes(this.getMin()));
	}

	@Override
	public boolean includes(UnOpenedInterval unOpenedinterval) {
		return ((unOpenedinterval.includes(this.getMax()) || (this.getMax()==unOpenedinterval.getMax())) && unOpenedinterval.includes(this.getMin()));
	}

}
