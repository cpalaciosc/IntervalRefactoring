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
	
	public boolean includes(Interval interval){
		return (interval.getMin().equalsValue(this.min.getValue()) || min.compareWhenMin(interval.getMin().getValue()))
				&&(interval.getMax().equalsValue(this.max.getValue())||max.compareWhenMax(interval.getMax().getValue()));
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
