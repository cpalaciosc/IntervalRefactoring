package intervals;

public abstract class Interval {

	private double min;
	private double max;

	public Interval(double minimum, double maximum) {
		this.min = minimum;
		this.max = maximum;
	}

	public double midPoint() {
		return (this.max + this.min)/2;
	}

	public abstract boolean includes(double value);
	
	public abstract boolean includes(Interval interval);
	
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

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}
}
