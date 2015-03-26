package intervals;

public class Interval {

	private double min;
	private double max;

	public Interval(double minimum, double maximum) {
		this.min = minimum;
		this.max = maximum;
	}

	public double midPoint() {
		return (this.max + this.min)/2;
	}

	public boolean includes(double value) {
		
		switch (this.opening){
			case LEFT_OPENED:
				return (value>this.min&&value<=this.max);
			case RIGHT_OPENED:
				return (value>=this.min&&value<this.max);
			case BOTH_OPENED:
				return (value>this.min&&value<this.max);
			case UNOPENED:
				return (value>=this.min&&value<=this.max);
		}
		return false;
	}
	
	public boolean includes(Interval interval) {
		
		switch (interval.opening){
			case LEFT_OPENED:
				return ((this.includes(interval.min) || (interval.min==this.min)) && this.includes(interval.max));
			case RIGHT_OPENED:
				return ((this.includes(interval.max) || (interval.max==this.max)) && this.includes(interval.min));
			case BOTH_OPENED:
				return ((this.includes(interval.min) || (interval.min==this.min))) && ((this.includes(interval.max) || (interval.max==this.max)));
			case UNOPENED:
				return this.includes(interval.min) && this.includes(interval.max);
		}
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
