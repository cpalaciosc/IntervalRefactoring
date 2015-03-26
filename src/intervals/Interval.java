package intervals;

public class Interval {

	private double min;
	private double max;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.min = minimum;
		this.max = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (this.max + this.min)/2;
	}

	public boolean includes(double value) {
		//TODO
		return false;
	}
	
	public boolean includes(Interval interval) {
		//TODO
		return false;
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

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}
}
