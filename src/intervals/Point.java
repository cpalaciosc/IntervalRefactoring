package intervals;

public abstract class Point {
	private double value;
	
	public Point(double value){
		this.value=value;
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public abstract boolean compareWhenMax(double value);
	
	public abstract boolean compareWhenMin(double value);
	
	public abstract boolean equalsValue(double value);
}
