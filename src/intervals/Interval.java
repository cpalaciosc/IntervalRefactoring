package intervals;

public abstract class Interval {

	private Point min;
	private Point max;

	public Interval(Point minimum, Point maximum) {
		this.min = minimum;
		this.max = maximum;
	}

	public double midPoint() {
		return (this.max.getValue() + this.min.getValue())/2;
	}

	public boolean includes(double value){
		return min.compareWhenMin(value)&&max.compareWhenMax(value);
	}
	
	public abstract boolean includes(Interval interval);	
	
	public abstract boolean execute(Interval interval);
	
	protected boolean sameMinimum(Interval interval){
		return this.getMin().getValue()==interval.getMin().getValue();
	}
	
	protected boolean sameMaximum(Interval interval){
		return this.getMax().getValue()==interval.getMax().getValue();
	}
	
	protected boolean includeMinimum(Interval interval){
		return interval.includes(this.getMin().getValue());
	}
	
	protected boolean includeMaximum(Interval interval){
		return interval.includes(this.getMax().getValue());
	}
	
	public boolean intersectsWith(Interval interval) {
		//TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		//TODO
		return null;
	}

	@Override
	public String toString() {
		//TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		//TODO
		return false;
	}

	public Point getMin() {
		return min;
	}

	public Point getMax() {
		return max;
	}
}
