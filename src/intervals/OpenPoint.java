package intervals;

public class OpenPoint extends Point {

	public OpenPoint(double value) {
		super(value);
	}

	@Override
	public boolean compareWhenMax(double value) {
		return value<this.getValue();
	}

	@Override
	public boolean compareWhenMin(double value) {
		return value>this.getValue();
	}
	
	public boolean equalsValue(double value){
		return this.getValue() == value;
	}
}
